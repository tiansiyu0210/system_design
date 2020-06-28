package DecoratorDesignPatternDemo.InterfaceDemo;

public class Base implements Cake {

    @Override
    public String getDescription() {
        return "1 base ";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
