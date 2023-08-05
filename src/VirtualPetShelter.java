import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();
    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }
    public VirtualPet getPetByName(String name) {
        return pets.get(name);
    }
    public void addPet(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }
    public void removePet(String name) {
        pets.remove(name);
    }
    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }
    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }
    public void playWithPet(String name) {
        VirtualPet pet = pets.get(name);
        if (pet != null) {
            pet.play();
        }
    }
    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }
    public void oilPet(){
        for (VirtualPet pet : pets.values()){
            pet.oilPet();
        }
    }
    public void cleanPet(){
        for (VirtualPet pet : pets.values()){
            pet.tick();
        }
    }
}