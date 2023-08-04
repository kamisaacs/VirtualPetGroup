public class VirtualPetTick {
    // this is for organic pet tick
    // this by Rui
    public void organicPetTick(){
        hunger += 10;
        thirst += 10;
        boredom -= 10;
        health += 5;
        sleepy -= 5;
    }
    // this is for robotic pet tick
    public void roboticPetTick(){
        energy -= 10;
        rusty -= 5;
        oil -= 10;
    }
    
}
