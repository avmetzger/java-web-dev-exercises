package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius = 0.0;
        do {
            System.out.println("Please input the radius of a circle to calculate its area:");
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
            } else {
                input.nextLine();
            }
        } while(radius <= 0.0);
        input.close();
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
