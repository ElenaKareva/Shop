public class Apple extends Goods implements Scales {
    private final String name = "яблоки";
    private final int price = 140;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void weigh() {
        System.out.println("Взвешиваем яблоки...");
    }

    @Override
    public String toString() {
        return  name + ", цена " + price;
    }
}
