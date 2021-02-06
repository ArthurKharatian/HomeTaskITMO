package patterns.facade;

public class Riding implements Car{

    @Override
    public boolean isStarted() {
        return true;
    }
    @Override
    public boolean isStopped() {
        return false;
    }
}
