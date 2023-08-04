
public class Cat extends Animal {
    private String type;

    public Cat(String name, String type) {
        super(name, "Cat");

    }

    @Override
    public String toString() {
        return name + " is your cats name.";
    }
}