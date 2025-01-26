package Decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("It has Milk too.");
    }
}
