public abstract class Goods implements GoodsInterface {
    protected String name;
    protected Integer price;
    protected Integer grade;

    abstract String getName();

    abstract Integer getPrice();
}
