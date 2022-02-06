public class Fish extends Goods implements Scales{
    private final String name = "свежая рыбка";
    private final int price = 580;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void weigh() {
        System.out.println("Взвешиваем только что пойманную рыбку...");
    }

    @Override
    public String toString() {
        return name + ", цена " + price;
    }
}
