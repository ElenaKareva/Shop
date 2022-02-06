public class Milk extends Goods implements Pack{
    private final String name = "молоко";
    private final int price = 70;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void pack () {
        System.out.println("Кладем молоко в корзинку");
    }

    @Override
    public String toString() {
        return name + ", цена " + price;
    }
}
