package patterns.factory;

public class Factory {
    public static void main(String[] args) {

    }
    public Car getCar(String name){
        Car car = switch (name) {
            case "US car" -> new USCar();
            case "RUS car" -> new RUSCar();
            case "EU car" -> new EUCar();
            default -> null;
        };
        return car;
    }

    public int getDoorsCount(Car car){
        return car.getDoorsCount();
    }
}
