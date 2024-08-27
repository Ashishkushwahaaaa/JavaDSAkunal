package OOPs.Interfaces;

public class Car implements Engine, Brake, Media {

    int a = 30;
    @Override
    public void start() {
        System.out.println("I start like a normal Engine car");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal Engine car");

    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal Engine car");

    }
    
}
