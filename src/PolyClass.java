class Animal2 {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig2 extends Animal2 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog2 extends Animal2 {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class PolyClass {
    public static void main(String[] args) {
        Animal2 myAnimal = new Animal2();  // Create a Animal object
        Animal2 myPig = new Pig2();  // Create a Pig object
        Animal2 myDog = new Dog2();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}