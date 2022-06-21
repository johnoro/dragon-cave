import java.util.Scanner;

public class DragonCave {
    public static void enterCave() {
        System.out.println("You approach the cave...");
        System.out.println("It is dark and spooky...");
        System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Intro
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        int path = s.nextInt();

        switch (path) {
            case 1:
                enterCave();
                System.out.println("Gobbles you down in one bite!");
                break;
            case 2:
                enterCave();
                System.out.println("Spits out a horde of treasure at your feet!");
                break;
            default:
                System.out.println("It seems you tried to enter a nonexistent cave!");
        }
    }
}