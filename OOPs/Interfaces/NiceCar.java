package OOPs.Interfaces;

public class NiceCar {
    
    private Engine engine;
    private Media player= new CDsPlayer();

    public NiceCar(){
        engine = new PowerEngine();  //This will act like a default engine as the object created then the default constructor is called and the engine assigned to powerEngine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void Mediastart(){
        player.start();
    }
    public void upgradeToElectric(){
        engine = new ElectricEngine();
    }
    public void upgradeToPower(){
        engine = new PowerEngine();
    }



}
