package Decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("IT has Sugar as well.");
    }
}
