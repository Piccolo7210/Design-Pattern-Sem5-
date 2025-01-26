package Decorator;

public class WhippedCreamDecorator extends CoffeeDecorator{

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("It has Whipped Cream as well.");
    }
}
