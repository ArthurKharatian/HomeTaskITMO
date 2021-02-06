package patterns.factory;

public class EUCar implements Car{
    private String name;
    @Override
    public void getCar() {
      name = "EU car";
    }

    @Override
    public int getDoorsCount() {
        return 3;
    }
}
