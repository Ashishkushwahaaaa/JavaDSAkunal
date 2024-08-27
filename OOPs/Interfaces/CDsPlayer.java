package OOPs.Interfaces;

public class CDsPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Starting Media Player");

    }

    @Override
    public void stop() {
        System.out.println("Stoping Media Player");
    }
    
}
