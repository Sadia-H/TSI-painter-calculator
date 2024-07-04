package org.example;

import java.util.Scanner;

public class ValidInputs {
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
