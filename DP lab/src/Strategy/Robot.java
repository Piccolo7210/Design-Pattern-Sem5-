package Strategy;

public class Robot {
    String name;
    Behavior behavior;
    public Robot(Behavior behavior, String name){
        this.name=name;
        this.behavior=behavior;
    }
    public void setBehavior(Behavior behavior){
        this.behavior=behavior;
    }
    public void showCharacteristics(){
        System.out.print("Name: "+this.name+ "\nBehaviour: ");
        this.behavior.Character();
    }
}
