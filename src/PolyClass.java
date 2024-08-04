class Animal2 {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig2 extends animal2 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog2 extends animal2 {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class PolyClass {
    public static void main(String[] args) {
        animal2 myAnimal = new animal2();  // Create a Animal object
        animal2 myPig = new Pig2();  // Create a Pig object
        animal2 myDog = new Dog2();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}