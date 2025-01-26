package Decorator;

public abstract class CoffeeDecorator implements Coffee {
    Coffee wrappee;
    public CoffeeDecorator(Coffee coffee){
        this.wrappee=coffee;
    }

    @Override
    public void getDescription() {
        wrappee.getDescription();
    }

}
