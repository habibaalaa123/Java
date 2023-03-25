/*
program to take an integer “n” from the user, then print Pascal's triangle to the
nth row.
 */

import java.util.Scanner;

public class Printing_Pascal_Triangle {
    static int solveFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("please enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double combination[] = new double[number];
        int temporary = 0;
        int factorialN = solveFactorial(number);
        for (int j = 0; j <=number; j++) {
            for (int k = 0; k < number-j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                temporary = (solveFactorial(j - i) * solveFactorial(i));
                System.out.print( solveFactorial(j)/temporary + " ");
            }
            System.out.println();
        }
    }
}
