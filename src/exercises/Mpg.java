package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven:");
        double miles = input.nextDouble();
        System.out.println("Enter the number of gallons of gas your car used:");
        double gallon = input.nextDouble();
        double mpg = miles / gallon;
        System.out.println("Your MPG is " + mpg + ".");
    }
}
