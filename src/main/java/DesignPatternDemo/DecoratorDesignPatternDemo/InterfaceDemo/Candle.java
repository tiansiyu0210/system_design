package DesignPatternDemo.DecoratorDesignPatternDemo.InterfaceDemo;

public class Candle implements Cake {

    private Cake cake;

    public Candle(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "with Candle ";
    }

    @Override
    public int getCost() {
        return cake.getCost() + 16;
    }
}
