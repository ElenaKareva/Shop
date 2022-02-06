public class Potato extends Goods implements Scales{
    private final String name = "картошка";
    private final int price = 54;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void weigh() {
        System.out.println("Взвешиваем картошку...");
    }

    @Override
    public String toString() {
        return name + ", цена " + price;
    }
}
