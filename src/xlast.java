import java.util.ArrayList;

class xlast {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.indexOf("Ford"));
        System.out.println(cars.lastIndexOf("Ford"));
    }
}