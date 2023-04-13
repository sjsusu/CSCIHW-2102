package HW5;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to add?");
        int length = scan.nextInt();
        System.out.println("----------------------------------------");
        scan.close();

        int[] array = generateArray(length);
        printArray(array);
        int sum = findSum(array, length - 1);
        System.out.println("Sum: " + sum);

    }

    // Genereates a random integer between a min(inclusive) and max (exclusive)
    public static int generateInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    // Generates an array of integers (between 1 and 100) w/ a given length
    public static int[] generateArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = generateInt(1, 101);
        }

        return array;
    }

    // Finds the sum of all the integers in the array
    public static int findSum(int[] array, int maxIndex) {
        if (maxIndex == 0) {
            return array[0];
        }

        return array[maxIndex] + findSum(array, maxIndex - 1);
    }

    // Prints the generated integer array w/ 5 terms in each row.
    public static void printArray(int[] array) {
        int length = array.length;
        System.out.print("Number Array: [");
        for (int i = 0; i < length; i++) {
            if (i % 5 == 0 && i != 0) {
                System.out.println();
                System.out.print("               ");
            }

            System.out.print(" " + array[i]);

            if (i != length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ]");
        System.out.println("----------------------------------------");
    }

}