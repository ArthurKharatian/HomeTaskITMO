package patterns.factory;

public class USCar implements Car{
    private String name;
    @Override
    public void getCar() {
       name = "US car";
    }

    @Override
    public int getDoorsCount() {
        return 5;
    }
}
