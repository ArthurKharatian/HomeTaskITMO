package patterns.facade;

public class Facade {
    private Riding riding;
    private Engine engine;
    public Facade() {
        riding = new Riding();
        engine = new Engine();
    }
    public boolean startCar() {
        return engine.isStarted() && riding.isStarted();
    }
    public boolean stopCar() {
      return   riding.isStopped() && engine.isStopped();
    }

    public static void main(String[] args) {
    }
}
