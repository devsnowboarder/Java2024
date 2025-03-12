package This_Tutor;

class Person {
    private String name;

    public Person(String name) {
        this.name = name; // Refers to the instance variable "name"
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }
}

public class thisExample {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        p.display(); // Output: Name: Alice
    }
}