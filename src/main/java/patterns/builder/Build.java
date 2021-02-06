package patterns.builder;

public class Build {
    public static void main(String[] args) {

    }
    private Builder builder;

    public Build() {
        builder = new FirstHouse();
    }
    public House buildHouse(){
        return builder.buildHouse();
    }

}
