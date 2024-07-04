package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numberOfWalls = getValidNumber(s, "How many walls are in the room?");

        double totalArea = 0;

        for (int i = 1; i <= numberOfWalls; i++) {
            double wallHeight = getValidDouble(s, "What is the height of the wall " + i + " in metres?");
            double wallWidth = getValidDouble(s, "What is the width of the wall " + i + " in metres?");
            double wallArea = 0;

            wallArea = wallHeight * wallWidth;
            System.out.println("The area of the wall is: " + wallArea + " metres.");
            totalArea += wallArea;

        }

        int numberOfNonPaintedWalls = getValidNumber(s, "How many walls/areas will not be painted? (If none, enter 0.)");
        double wallAreaNotPainted = 0;

        for (int i =1; i<= numberOfNonPaintedWalls; i++) {
            double noPaintWalls = getValidDouble(s, "Please enter the area of wall: " + i + " in metres." );
            wallAreaNotPainted += noPaintWalls;
        }

        totalArea = totalArea - wallAreaNotPainted;
        System.out.println("The total area of the room is: " + totalArea + " metres squared.");

        double paintCoverage = getValidDouble(s, "What is the paint coverage per litre (in square feet)?");

        double paintRequired = totalArea / paintCoverage;
        System.out.println("The amount of paint required for this room is: " + paintRequired + "L.");


    }

    public static int getValidNumber(Scanner scanner, String prompt) {
        int validInput = -1;
        while (validInput <= 0) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                validInput = scanner.nextInt();
                if (validInput <= 0) {
                    System.out.println("Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return validInput;
    }

    public static double getValidDouble(Scanner scanner, String prompt) {
        int validDouble = -1;
        while (validDouble <= 0) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                validDouble = scanner.nextInt();
                if (validDouble <= 0) {
                    System.out.println("Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return validDouble;
    }


}