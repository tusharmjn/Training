package com.employee.payroll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<Employee>();

        System.out.println("enter name, email, phonenumber of Salaried Employee : ");
        String name = sc.nextLine();
        String email = sc.nextLine();
        int phonenumber = sc.nextInt();
        SalariedEmployee s = new SalariedEmployee(name, email, phonenumber);
        list.add(s);

        System.out.println("enter name, email, phonenumber and working hours of Hourly Employee: ");
        sc.nextLine();
        String nameH = sc.nextLine();
        String emailH = sc.nextLine();
        int phonenumberH = sc.nextInt();
        int hoursH = sc.nextInt();
        HourlyEmployee h = new HourlyEmployee(nameH, emailH, phonenumberH, hoursH);
        list.add(h);

        System.out.println("enter name, email, phonenumber and sales of Commission Employee: ");
        sc.nextLine();
        String nameE = sc.nextLine();
        String emailE = sc.nextLine();
        int phonenumberE = sc.nextInt();
        double salesE = sc.nextInt();
        CommissionEmployee c = new CommissionEmployee(nameE, emailE, phonenumberE, salesE);
        list.add(c);

        System.out.println("enter name, email, phonenumber, and sales of BaseSalariedCommission Employee: ");
        sc.nextLine();
        String nameB = sc.nextLine();
        String emailB = sc.nextLine();
        int phonenumberB = sc.nextInt();
        double salesB = sc.nextInt();
        BaseSalariedCommissionEmployee b = new BaseSalariedCommissionEmployee(nameB, emailB, phonenumberB, salesB);
        list.add(b);

        System.out.println(list);

        System.out.println("enter the employee name for which you want to calclulate Payroll: ");
        sc.nextLine();
        String nameInput = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            Employee tempName = list.get(i);
            if (nameInput.equals(tempName.getName())) {
                System.out.println(
                        "Weekly Payroll " + " of " + tempName.getName() + " is: " + list.get(i).calculateSalary());
            }
        }
    }
}

//}