package com.training.oop;

import java.util.ArrayList;
import java.util.Scanner;

class Circle {
    private String name;
    private double radius;
    private String color;

    Circle(double r, String n, String c) {
        this.radius = r;
        name = n;
        color = c;
    }

    public void setRadius(double a) {
        radius = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setName(String localName) {
        name = localName;
    }

    public String getName() {
        return name;
    }

    public void setColor(String c) {
        name = c;
    }

    public String getColor() {
        return color;
    }

}

public class AreaCircle {
    public static void main(String[] args) {

        ArrayList<Circle> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of circles u want to input : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Input radius, name and color of circle " + i + ": ");
            double radius1 = sc.nextDouble();
            sc.nextLine();
            String name1 = sc.nextLine();
            String color1 = sc.nextLine();
            Circle c1 = new Circle(radius1, name1, color1);
            System.out.println("Name: " + c1.getName() + ", Radius: " + c1.getRadius() + ", Color: " + c1.getColor());
            List.add(c1);
        }
        System.out.println("which circle area : ");
        String nameInput = sc.nextLine();
        for (int i = 0; i < List.size(); i++) {

            Circle tempCircle = List.get(i);

            if (nameInput.equals(tempCircle.getName())) {

                double area = tempCircle.getRadius() * tempCircle.getRadius() * 22 / 7;
                System.out.println("Area of circle " + (i + 1) + ": " + area);
            }
        }
    }
}
