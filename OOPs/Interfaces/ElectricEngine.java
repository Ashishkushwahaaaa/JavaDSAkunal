package OOPs.Interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stoping Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Electric Engine");
    }
    
}
