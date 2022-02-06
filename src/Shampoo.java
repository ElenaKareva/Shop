public class Shampoo extends Goods implements Pack{
    private final String name = "шампунь";
    private final int price = 210;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void pack () {
        System.out.println("Кладем шампунь в корзинку");
    }

    @Override
    public String toString() {
        return name + ", цена " + price;
    }
}
