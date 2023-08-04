public class RoboticInteractions {
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
                switch (choice) {
                    case 1: {
                        // charge your pet
                        System.out.println("You are charging " + currentPet.getName() + ", it will be at 100%.");
                        currentPet.energy += 10;

                        currentPet.oil += 10;
                        currentPet.rust += 10;

                        Menu.gameState(index);

                        Menu.petStats(index + 1);
                        break;
                    }

                    case 2: {
                        // give your pet oil
                        System.out.println("You gave " + currentPet.getName() + " oil an it can move easier");
                        currentPet.oil -= 10;
                        currentPet.energy += 10;
                        currentPet.rust += 10;
                        Menu.petStats(index + 1);
                        break;
                    }

                    case 3: {
                        // clean your pet
                        System.out.println(
                                "You clean the rust off of " + currentPet.getName() + " and it can is shining");
                        currentPet.rust -= 10;
                        currentPet.energy += 10;
                        currentPet.oil += 10;
                        Menu.petStats(index + 1);
                        break;
                    }

                    case 4: {
                        // Kick your pet
                        System.out.println("You kick your pet " + currentPet.getName() + " and it cries in pain!");
                        currentPet.rust += 10;
                        currentPet.oil += 10;
                        currentPet.energy += 10;
                        // current
                        Menu.petStats(index + 1);
                        break;
                    }
                    case 5: {

                        break;
                    }
                }
                Menu.interactionsMenu();
                choice = input.keyboardInt();
            } while (choice != 5);
        }

    }
}
