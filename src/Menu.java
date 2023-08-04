import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void MainMenu() {
        System.out.println("");
        System.out.println("======================================================");
        System.out.println(" || Welcome to Thee \"Organic Robotics\" Pet Shelter ||");
        System.out.println("======================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("We have dogs & cats for you to choose from. See below: ");
        System.out.println("");

        

        boolean exitLoop = false;
        while (!exitLoop) {
            int option = animalMenu();
            input.nextLine();
            switch (option) {
                case 1: {
                    naturalDog();
                    break;
                }
                case 2: {
                    naturalCat();
                    break;
                }
                case 3: {
                    // aiCat();
                    break;
                }
                case 4: {
                    // aiDog();
                    break;
                }
                default:
                exitLoop = true;
                    break;
            }

        }

    }

    public int animalMenu() {

        System.out.println("Animals " + animals.size());
        System.out.println("");
        System.out.println("Which animal would you like to have?: ");
        System.out.println("");
        System.out.println("[0] Exit");
        System.out.println("[1] A naturally borne dog");
        System.out.println("[2] A naturally borne cat");
        System.out.println("[3] An Ai manufactured cat");
        System.out.println("[4] An AI manufactured dog");
        System.out.println("");
        System.out.println("Make your choice: ");
        int option = input.nextInt();
        
        return option;

    }

    public void naturalDog() {
        System.out.println("What will you name your dog?");
        System.out.println("");
        String name = input.nextLine();
        System.out.println("");
        Dog dog = new Dog(name, name);
        animals.add(dog);
        System.out.println(dog);
        System.out.println("");

    }

    public void naturalCat(){
        System.out.println("What will you name your cat?");
        String name = input.nextLine();
        Cat cat = new Cat(name, name);
        animals.add(cat);
        System.out.println(cat);
        System.out.println("");
        AnimatedArt.helloKitty();
        System.out.println("");
    }

}
