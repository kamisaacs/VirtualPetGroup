
public class Animal {

    String name;
    String species;
    String type;
    int hunger = 100;
    int boredom = 100;
    int health = 50;
    int sleep = 50;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;

    }

    public String getSpecies() {
        return species;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    @Override
    public String toString() {
        return "Animal";
    }
}