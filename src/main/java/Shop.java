public class Shop {

    public static void main(String[] args) {
        Recipes recipes = new Recipes();
        BubbleTeaBuilder bubbleTeaBuilder = new BubbleTeaBuilder();
        recipes.createMilkTea(bubbleTeaBuilder);
        BubbleTea bubbleTea = bubbleTeaBuilder.getBubbleTea();
        System.out.println(bubbleTea.toString());
    }
}
