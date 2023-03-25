/*
a java program to print the following pattern.
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *
 */
import java.util.Scanner;

public class Printing_Certain_Pattern {
    public static void main(String[] args) {
        System.out.println("please enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=number;i>0;i--){
            for(int k=0;k<number-i;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<number;i++){
            for(int k=0;k<number-(i+1);k++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
