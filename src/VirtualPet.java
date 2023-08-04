 
public class VirtualPet {
    private String name;
    private String description;
    private int boredom;
    private int hunger;
    private int thirst;
    private int healthFactor;
    private String type_of_pet;
    


    
    public VirtualPet(String name, String description, int boredom, int hunger, int thirst , int healthFactor , String type_of_pet) {
        this.name = name;
        this.description = description;
        this.boredom = boredom;
        this.hunger = hunger;
        this.thirst = thirst;
        this.healthFactor = healthFactor;
        this.type_of_pet = type_of_pet;
    }
    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
    public void tick() {
        hunger = hunger + 10;
        thirst = thirst + 10;
        boredom = boredom + 10;
    }
    public void feed() {
        hunger = hunger - 30;
        thirst = thirst + 30;
        healthFactor = healthFactor +10;
    }
    public void water() {
        thirst = thirst -  30;
        healthFactor = healthFactor + 10;
    }
    public void play() {
        boredom = boredom - 30;
        hunger = hunger + 30;
        thirst =  thirst + 30;
        healthFactor = healthFactor - 10;
    }
    public String getType_of_pet() {
        return type_of_pet;
    }
    public void setType_of_pet(String type_of_pet) {
        this.type_of_pet = type_of_pet;
    }

    
}