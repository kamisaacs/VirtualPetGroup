
public class Dog extends Animal {

    private String type;

    public Dog(String name, String species) {
        super(name, "Dog");
        this.type = type;

    }

    public void feed() {
        System.out.println("*WOOF,WOOF,WOOF!*");
    }

    public void Thirst() {
        System.out.println("*GULP,GULP*");
    }
    public void Abandon(){
        System.out.println("Aauuuu!");
    } 

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Your animals name is " + name + " and they are a " + species + " species.  You have chosen a " + type
                + " dog.";

    }
}