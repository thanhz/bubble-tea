public class Shop {

    public static void main(String[] args) {
        Director director = new Director();

        MilkTeaBuilder milkTeaBuilder = new MilkTeaBuilder();
        director.createMilkTea(milkTeaBuilder);

        BubbleTea bubbleTea = milkTeaBuilder.getBubbleTea();
        System.out.println(bubbleTea.toString());
    }
}
