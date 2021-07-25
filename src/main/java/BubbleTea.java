public class BubbleTea {
    private String size;
    private String sweetness;
    private String topping; //Add multiple toppings. A list maybe?

    public BubbleTea(String size, String sweetness, String topping) {
        this.size = size;
        this.sweetness = sweetness;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "BubbleTea{" +
                "size='" + size + '\'' +
                ", sweetness='" + sweetness + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
