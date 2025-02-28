package apiStuff;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class apiCallTest2 {
    public static void main(String[] args) {
        // Define the URL for the GET request
       // String urlString = "https://fake-json-api.mock.beeceptor.com/users"; // Example URL

        List<String>  urlString = new ArrayList<>();

        urlString.add("https://fake-json-api.mock.beeceptor.com/users");
        urlString.add("https://dummy-json.mock.beeceptor.com/posts");
        urlString.add("https://dummy-json.mock.beeceptor.com/posts");
        urlString.add("https://dummy-json.mock.beeceptor.com/continents");

        for (String urlString2 : urlString) {

            try {
                // Create a URL object

                URL url = new URL(urlString2);

                // Open a connection to the URL
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // Set the request method to GET
                connection.setRequestMethod("GET");

                // Set a timeout for the connection
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                // Get the response code
                int responseCode = connection.getResponseCode();
                System.out.println("Response Code: " + responseCode);



                // If the response is OK (HTTP 200), read the response
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    // Read the response line by line
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    // Print the response content
                    System.out.println("Response: " + response.toString());
                    String resX = "Response"  + response.toString();
                    if ( resX.contains("name"))
                        System.out.println("Name is found xxxx");

                } else {
                    System.out.println("GET request failed.");
                }

                // Close the connection
                connection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 }
