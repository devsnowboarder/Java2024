package apiStuff;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class PutApiCall {
    public static void main(String[] args) {
        try {
            // URL of the API endpoint
            String urlString = "https://example.com/api/resource";
            URL url = new URL(urlString);

            // Create a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("PUT");
            connection.setDoOutput(true); // Allow sending data in the request body
            connection.setRequestProperty("Content-Type", "application/json");

            // Sample JSON data to send in the PUT request body
            String jsonInputString = "{\"name\":\"John\", \"age\":30}";

            // Send the request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Read the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response body (if necessary)
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                System.out.println("Response: " + response.toString());
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}