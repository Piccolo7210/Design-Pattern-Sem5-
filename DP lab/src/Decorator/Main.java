package Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new RawCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Coffee Description: ");
        coffee.getDescription();

    }
}
