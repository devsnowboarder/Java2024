package This_Tutor;

class Builder {
    private String name;

    public Builder setName(String name) {
        this.name = name;
        return this; // Returning current instance for method chaining
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class builderExample {
    public static void main(String[] args) {

        new Builder().setName("John").display(); // Output: Name: John
    }
}