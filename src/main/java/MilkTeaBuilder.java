public class MilkTeaBuilder implements Builder {
    private String size;
    private String sweetness;
    private String topping;

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    @Override
    public void setTopping(String topping) {
        this.topping = topping;
    }

    public BubbleTea getBubbleTea(){
        return new BubbleTea(size,sweetness,topping);
    }
}
