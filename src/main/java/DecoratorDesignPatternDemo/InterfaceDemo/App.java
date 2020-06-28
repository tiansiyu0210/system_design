package DecoratorDesignPatternDemo.InterfaceDemo;

public class App {
    public static void main(String[] args) {
        Base base = new Base();
        System.out.println(base.getDescription() + " price is: " + base.getCost());

        Fruit fruit = new Fruit(base);
        System.out.println(fruit.getDescription() + " price is: " + fruit.getCost());

        Candle candle = new Candle(fruit);
        System.out.println(candle.getDescription() + " price is: " + candle.getCost());

        System.out.println("=====================");
        new Candle(new Fruit(new Base()));
    }
}
