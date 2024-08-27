package OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {

        Engine car = new Car();
        // int n = car.a; // a cannot be accessed as in not present in the Reference type class Engine;
        // Car car = new Car();
        // car.start();
        // car.acc();
        // car.stop();

        Media carMedia = new Car();
        // carMedia.start();
        //Here, both time the same method is running even if it of engine or media.To prevent from it we can create different class implementing the different interfaces and then we can use its method seperately;



        NiceCar ncar = new NiceCar();
        ncar.start();
        ncar.Mediastart();
        ncar.stop();
        ncar.upgradeToElectric();
        ncar.start();
        
    }
}
