public class Interactions {
    static Keyboard input = new Keyboard();

    /**
     * @param choice
     * @param indexChoice
     */
    public static void interactPets(int choice, int indexChoice) {

        int index = indexChoice - 1;

        Pet currentPet = MakePet.allPets.get(index);
        do {
            switch (choice){
                case 1: {
                    //feed your pet
                    System.out.println("You fed " + currentPet.getName() + " and the food is delicious");
                    currentPet.health += 10;
                    currentPet.hunger -= 10;
                    currentPet.thirst += 10;
                    currentPet.boredom +=10;
                    currentPet.sleepy += 10;
                    Menu.gameState(index);
                    
                    Menu.petStats(index +1);
                    break;
                }

                case 2: {
                    //give your pet water
                    System.out.println("You gave " + currentPet.getName() + " water an its quenched");
                    currentPet.thirst -= 10;
                    currentPet.health += 10;
                    currentPet.hunger += 10;
                    currentPet.boredom += 10;
                    Menu.petStats(index +1);
                    break;
                }

                case 3: {
                    //play with your pet 
                    System.out.println("You play with " + currentPet.getName() + "and its having fun!");
                    currentPet.boredom -= 10;
                    currentPet.hunger += 10;
                    currentPet.thirst += 10;
                    Menu.petStats(index +1);
                    break;
                }

                case  4: {
                    //pet your pet
                    System.out.println("You pet " + currentPet.getName() + " and loves your pets");
                    currentPet.boredom -=10;
                    currentPet.hunger += 10;
                    currentPet.thirst += 10;
                    Menu.petStats(index +1);
                    break;
                }

                case  5: {
                    //put your pet to sleep
                    System.out.println("You put your pet " + currentPet.getName() + " to sleep");
                    currentPet.boredom +=10;
                    currentPet.health +=10;
                    currentPet.hunger +=10;
                    currentPet.thirst +=10;
                    Menu.petStats(index +1);
                    break;
                }

                case  6: {
                    //Kick your pet
                    System.out.println("You kick your pet " + currentPet.getName() + " and it cries in pain!");
                    currentPet.boredom +=10;
                    currentPet.health -=10;
                    currentPet.hunger +=10;
                    currentPet.thirst +=10;
                    // current
                    Menu.petStats(index +1);
                    break;
                }
                case 7: {
                    
                    break;
                }
            }
            Menu.interactionsMenu();
            choice = input.keyboardInt();
        } while (choice != 7);
    }

    
}