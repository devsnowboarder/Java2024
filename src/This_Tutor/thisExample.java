package This_Tutor;

class Person2 {
    private String name;

    public Person2(String name) {
        this.name = name; // Refers to the instance variable "name"
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }
}

public class thisExample {
    public static void main(String[] args) {
        Person2 p = new Person2("Alice");
        p.display(); // Output: Name: Alice
    }
}