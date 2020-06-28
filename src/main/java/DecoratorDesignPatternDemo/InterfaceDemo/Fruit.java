package DecoratorDesignPatternDemo.InterfaceDemo;

public class Fruit implements Cake {
    private Cake cake;

    public Fruit(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "with fruit ";
    }

    @Override
    public int getCost() {
        return cake.getCost() + 15;
    }
}
