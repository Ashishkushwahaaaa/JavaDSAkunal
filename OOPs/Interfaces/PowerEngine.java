package OOPs.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stoping Power Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Power Engine");
    }
    
}
