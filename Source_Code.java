
// set the package name
package com.dellpogie;

// add reference to the Java Standard Library
import java.util.Scanner;

// create Christmas tree class
public class ChristmasTree {

    // entry point in Java
    public static void main(String[] args) {

        // user input listener
        Scanner scanner = new Scanner(System.in);

        // ask the user to input a number
        System.out.print("Enter the height of the tree: ");

        // scan for the user input
        int intChristmasTreeHeight = scanner.nextInt();

        // draw the Christmas tree on screen
        drawChristmasTree(intChristmasTreeHeight);
    }

    // method to draw the Christmas tree following the tree height user input
    public static void drawChristmasTree(int height) {

        // logic to draw tree on the screen
        for (int i = 0; i < height; i++) {
            // print the leading spaces ...
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // then print the stars ...
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // then move to the next line ...
            System.out.println();
        }

        // to finish, draw the trunk
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        // print greetings
        System.out.print("Merry Christmas!\nfrom DellPogie :-)\n\n\n");

    }
}
