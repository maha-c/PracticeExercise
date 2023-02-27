package JavaExercises;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mad Lib Generator!! Please enter following Inputs ");

        //Ask user to input words to form a story

        System.out.println("Noun: ");
        String noun1 = scanner.nextLine();

        System.out.println("Adjective: ");
        String adj1 = scanner.nextLine();

        System.out.println("Verb(past tense): ");
        String verb = scanner.nextLine();

        System.out.println("Adjective: ");
        String adj2 = scanner.nextLine();

        System.out.println("Noun: ");
        String noun2 = scanner.nextLine();

        // Construct the story
        System.out.println("\n  Once upon a time, there lived a " + adj1 + " " + noun1 + " " + " who " + verb + "ed "
                + "all day long. One day, " + adj2 + " " + noun2 + " appeared out of nowhere " + " and asked the " + noun1
                + " for help. \n The " + noun1 + " was hesitant at first, but then decided to lend a hand. Together, the "
                + adj1 + " " + noun1 + " and " + " the " + adj2 + " " + noun2 + " worked hard to solve the problem. In the end,"
                + " \n they succeeded and became great friends. " );

        scanner.close();

    }
}
