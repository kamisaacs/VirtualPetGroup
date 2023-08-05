<<<<<<< HEAD
=======
//package virtual_pet;
>>>>>>> 383e6c396d81d176726b03cef2445181aa6a0faa
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
    public void rechargePet(){
        for (VirtualPet pet : pets.values()){
            pet.rechargePet();
        }
    }
    public void polishPet(){
        for (VirtualPet pet : pets.values()){
            pet.polishPet();
        }
    }
    public void maintenancePet(){
        for (VirtualPet pet : pets.values()){
            pet.maintenancePet();
        }
    }
}