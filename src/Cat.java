
public class Cat extends Animal {
    private String type;

    public Cat(String name, String type) {
        super(name, "Cat");

    }

    public void Meow() {
        System.out.println("*MEOW*");
    }

    public void Feed() {
        System.out.println("*PURRR*");
    }

    public void Thirst() {
        System.out.println("*GULP,GULP*");
    }

    @Override
    public String toString() {
        return name + " is your cats name.";
    }
}