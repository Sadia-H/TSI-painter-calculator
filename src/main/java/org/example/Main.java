package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numberOfWalls = ValidInputs.getValidNumber(s, "How many walls are in the room?");

        double totalArea = 0;

        for (int i = 1; i <= numberOfWalls; i++) {
            int wallHeight = ValidInputs.getValidNumber(s, "What is the height of the wall " + i + " in metres?");
            int wallWidth = ValidInputs.getValidNumber(s, "What is the width of the wall " + i + " in metres?");
            int wallArea = 0;

            wallArea = wallHeight * wallWidth;
            System.out.println("The area of the wall is: " + wallArea + " metres.");
            totalArea += wallArea;

        }
        System.out.println("The total area of the room is: " + totalArea + " metres squared.");

        double paintCoverage = ValidInputs.getValidDouble(s, "What is the paint coverage per litre (in square feet)?");

        double paintRequired = totalArea / paintCoverage;
        System.out.println("The amount of paint required for this room is: " + paintRequired + "L.");


    }


}