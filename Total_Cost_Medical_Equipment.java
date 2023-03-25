/*
program that helps the
company decide whether to buy the device or not. It should ask the user to enter the prices
of devices to be imported and the price limit to buy the device. The program will then print
the count of the devices with valid prices and the total payment of these devices, or an error
message if all devices are excluded.
 */
import java.util.Scanner;

public class Total_Cost_Medical_Equipment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the maximum price limit to buy a device:");
        int priceLimit=sc.nextInt();
        int prices[]=new int[8];
        int sumOfDevices=0;
        int totalPayment=0;
        System.out.println("Please enter the prices of the devices:");
        for (int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        for(int i:prices){
            if(i<priceLimit){
                sumOfDevices+=1;
                totalPayment+=i;
            }
        }
        System.out.println("The number of devices the company should buy is "+sumOfDevices);
        System.out.println("The total payment = "+totalPayment);
    }
}
