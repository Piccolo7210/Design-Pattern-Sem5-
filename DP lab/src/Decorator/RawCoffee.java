package Decorator;

public class RawCoffee implements Coffee{
    @Override
    public void getDescription() {
        System.out.println("Raw Flavour ");
    }
}
