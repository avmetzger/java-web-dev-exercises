package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        Double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        Double width = input.nextDouble();
        Double area = length * width;
        System.out.println("The are of the rectangle is " + area + ".");
    }
}
