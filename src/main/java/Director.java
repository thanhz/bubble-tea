public class Director {

    public void createMilkTea(Builder builder){
        builder.setSize("large");
        builder.setSweetness("less sugar");
        builder.setTopping("tapioca");
    }

    public void createFruitTea(Builder builder){
        builder.setSize("large");
        builder.setSweetness("Regular");
        builder.setTopping("jelly");
    }
}
