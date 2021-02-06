package patterns.facade;

public class Engine implements Car{

    @Override
    public boolean isStarted() {
        return true;
    }
    @Override
    public boolean isStopped() {
        return false;
    }
}
