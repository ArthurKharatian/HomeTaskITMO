package patterns.factory;

public class RUSCar implements Car{
    private String name;
    @Override
    public void getCar() {
      name = "RUS car";
    }

    @Override
    public int getDoorsCount() {
        return 4;
    }
}
