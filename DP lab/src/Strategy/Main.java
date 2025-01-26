package Strategy;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot( new NormalBehavior(),"R-One");
        Robot robot2 = new Robot( new AggressiveBehavior(),"R-Two");
        Robot robot3 = new Robot( new DefensiveBehavior(),"R-Three");

        robot1.showCharacteristics();
        robot2.showCharacteristics();
        robot3.showCharacteristics();

        System.out.println("Changing behaviors dynamically...");

        robot1.setBehavior(new DefensiveBehavior());
        robot2.setBehavior(new NormalBehavior());
        robot3.setBehavior(new AggressiveBehavior());

        robot1.showCharacteristics();
        robot2.showCharacteristics();
        robot3.showCharacteristics();
    }
}

