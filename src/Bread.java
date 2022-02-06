public class Bread extends Goods implements Pack{
    private final String name = "хлеб";
    private final int price = 36;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void pack () {
        System.out.println("Кладем хлебушек в корзинку");
    }

    @Override
    public String toString() {
        return name + ", цена " + price;
    }
}

