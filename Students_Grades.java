/*
program to read an array of students’ grades from the user. The valid grades are
between 0 and 150. The program should do the following:
a) Produce a corresponding array (same size as the grades array) that has “V” or “I” in the
same grade position; “V” if the grade is valid and “I” if it is invalid. For example, a grade array
[90 -10 170 130 -2] will produce an output array [V I I V I]
b) Find and display the highest and lowest grades and specify their indexes.
c) Display the count of students with grades greater than 80%. e. Allocate and display
students with grades greater than average and their count.
 */
import java.util.Scanner;

public class Students_Grades {
    public static void main(String[] args) {
        int grades[]=new int[6];
        char validity[]=new char[6];
        int studentsAbove80=0;
        int studentsAboveAvg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Grades Of Students:");
        for(int i=0;i< grades.length;i++){
            grades[i]=sc.nextInt();
        }
        for(int j=0;j<grades.length;j++){
            if(grades[j]>150 || grades[j]<0)
            {
                validity[j]='I';
            }
            else{
                validity[j]='V';
            }
        }
        int highestScore=grades[0];
        int lowestScore=grades[0];
        int highestStudent=0;
        int lowestStudent=0;
        int numberOfValidInputs=0;
        for(int j=0;j<grades.length;j++) {
            if (grades[j] > highestScore && grades[j]<150) {
                highestScore = grades[j];
                highestStudent = j + 1;
            }
            if (grades[j] < lowestScore && grades[j]>0) {
                lowestScore = grades[j];
                lowestStudent = j + 1;
            }
            if (grades[j] > 0.8 * 150 && grades[j]<150) {
                studentsAbove80 += 1;
            }
        }
            for (int i=0;i< validity.length;i++) {
                System.out.print(validity[i] + ", ");
            }
            System.out.println("Student no. "+highestStudent+" With score "+highestScore+ " Is the highest");
            System.out.println("Student no. "+lowestStudent+" With score "+lowestScore+ " Is the lowest");
            int avg=0;
            for(int k:grades){
                if(k<150 && k>0) {
                    avg += k;
                    numberOfValidInputs++;
                }
            }
            for(int i=0;i< grades.length; i++){
                if(grades[i]>(avg/numberOfValidInputs)){
                    System.out.println("Student no. "+i +" is above average");
                    studentsAboveAvg+=1;
                }
            }
            System.out.println("Students above average are "+ studentsAboveAvg+ " Student");

}
}
