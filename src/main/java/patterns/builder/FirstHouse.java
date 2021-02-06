package patterns.builder;

public class FirstHouse extends Builder{

    public FirstHouse(){
        house = new House();
    }

    @Override
    public House buildHouse() {
        house.buildBase();
        house.buildWalls();
        house.buildFloors();
        house.buildRoof();
        return house;
    }
}
