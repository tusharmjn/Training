package com.inheritance.shapes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shapes> list = new ArrayList<Shapes>();

        System.out.println("Enter circle name and radius : ");
        String circleName = sc.nextLine();
        int a = sc.nextInt();
        Circle c = new Circle(circleName, a);
        list.add(c);

        System.out.println("Enter rectangle name length and width : ");
        sc.nextLine();
        String rectName = sc.nextLine();
        int length = sc.nextInt();
        int width = sc.nextInt();
        Rectangle r = new Rectangle(rectName, length, width);
        list.add(r);

        System.out.println("Enter square name and side : ");
        sc.nextLine();
        String sqName = sc.nextLine();
        int side = sc.nextInt();
        Square s = new Square(sqName, side);
        list.add(s);
//        System.out.println(list);

        System.out.println("enter the shape name for which you want to calclulate the area: ");
        sc.nextLine();
        String nameInput = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Shapes tempName = list.get(i);
            if (nameInput.equals(tempName.getName()))
                System.out.println("area of " + tempName.getName() + ": " + list.get(i).area());
        }

    }
}
