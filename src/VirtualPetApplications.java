import java.util.Scanner;

public class VirtualPetApplications {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(new VirtualPet("Joey", "Like to play fetch"));
        shelter.addPet(new VirtualPet("Johny", "Enjoy long walk"));
        shelter.addPet(new VirtualPet("Dee", "Love belly rub"));
        shelter.addPet(new VirtualPet("Tommy", "Sleep a lot"));
        System.out.println("Press 1 for Organic pet , Press 2 for Robotic pet");

        int option = input.nextInt();
        if (option == 1) {

            while (true) {
                displayStatus(shelter);
                System.out.println("\nWhat would you like to do next?\n");
                System.out.println("1. Feed the pets");
                System.out.println("2. Water the pets");
                System.out.println("3. Play with a pet");
                System.out.println("4. Adopt a pet");
                System.out.println("5. Admit a pet");
                System.out.println("6. Quit");
                int ch = input.nextInt();
                input.nextLine();
                switch (ch) {
                    case 1:
                        shelter.feedAllPets();
                        break;
                    case 2:
                        shelter.waterAllPets();
                        break;
                    case 3:
                        playWithPet(shelter, input);
                        break;
                    case 4:
                        adoptPet(shelter, input);
                        break;
                    case 5:
                        admitPet(shelter, input);
                        break;
                    case 6:
                        System.out.println("Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
                shelter.tick();
            }
        }
        if (option == 2) {
            while (true) {
                displayRobotStatus(shelter);
                System.out.println("\nWhat would you like to do next?\n");
                System.out.println("1. Recharge your pet");
                System.out.println("2. Polish your pet");
                System.out.println("3. Oil your pet");
                System.out.println("4. Quit");
                int ch = input.nextInt();
                input.nextLine();
                switch (ch) {
                    case 1:
                        shelter.rechargePet();
                        break;
                    case 2:
                        shelter.polishPet();
                        break;
                    case 3:
                        shelter.oilPet();
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
                shelter.tick();
            }

        }
    }

    private static void displayStatus(VirtualPetShelter shelter) {
        System.out.println("This is the status of your pets:\n");
        System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
        System.out.println("--------|-------|-------|-------");
        for (VirtualPet pet : shelter.getAllPets()) {
            System.out.printf("%-7s\t|%-7d|%-7d|%-7d\n", pet.getName(), pet.getHunger(), pet.getThirst(),
                    pet.getBoredom());
        }
    }

    private static void playWithPet(VirtualPetShelter shelter, Scanner input) {
        System.out.println("Please choose one:\n");
        for (VirtualPet pet : shelter.getAllPets()) {

            System.out.println(pet.getName() + " " + pet.getDescription());
        }
        String petName = input.nextLine();
        shelter.playWithPet(petName);
    }

    private static void adoptPet(VirtualPetShelter shelter, Scanner input) {
        System.out.println("Please choose one:\n");
        for (VirtualPet pet : shelter.getAllPets()) {
            System.out.println(pet.getName() + " " + pet.getDescription());
        }
        String petName = input.nextLine();
        shelter.removePet(petName);
    }

    private static void admitPet(VirtualPetShelter shelter, Scanner input) {
        System.out.println("Ok, so you'd like to admit a pet. Please provide the pet's information:\n");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Description: ");
        String description = input.nextLine();
        VirtualPet newPet = new VirtualPet(name, description);
        shelter.addPet(newPet);
    }

    private static void displayRobotStatus(VirtualPetShelter shelter) {
        System.out.println("This is the status of your pets:\n");
        System.out.println("Name\t|Health Factor\t");
        System.out.println("--------|--------------");
        for (VirtualPet pet : shelter.getAllPets()) {
            System.out.printf("%-7s\t|%-7d\n", pet.getName(), pet.getHealthFactor());
        }
    }
}