public class polyCarTest {
    public void sound() {
        System.out.println(" Big Boom sound");

    }

}

class  Porsche extends polyCarTest {
    @Override
    public void sound() {
        System.out.println(" Power sound");
    }

    public static void main(String args[]) {

        polyCarTest mikeCar = new Porsche();
        mikeCar.sound();

    }


}



