/*
a program to input a number from the user and find the reverse of the given
number.
 */
import java.util.Scanner;

public class Reverse_Given_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number:");
        int number= sc.nextInt();
        int firstDigit=0;
        while(number>0){
            firstDigit=number%10;
            System.out.print(firstDigit);
            number/=10;
        }

    }
}
