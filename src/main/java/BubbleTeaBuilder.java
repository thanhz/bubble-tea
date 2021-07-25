public class BubbleTeaBuilder {
    private String size;
    private String sweetness;
    private String topping;

    public void setSize(String size) {
        this.size = size;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public BubbleTea getBubbleTea(){
        return new BubbleTea(size,sweetness,topping);
    }
}
