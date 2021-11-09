package ex_11;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int lowest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        input.nextLine();

        int number[] = new int[num];
        for (int c = 0; c < num; c++) {
            System.out.println("\nEnter the " + (c + 1) + " of " + num + " number:");
            number[c] = input.nextInt();
            input.nextLine();
        }
        lowest = number[0];
        for (int c = 1; c < num; c++) {
            if (lowest > number[c])
                lowest = number[c];
        }
        System.out.println("\nThe lowest number is " + lowest);
    }
}
