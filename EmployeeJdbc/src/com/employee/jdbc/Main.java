package com.employee.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        EmployeeDb empDbObj = new EmployeeDb();
        empDbObj.createConnection();
//        Connection newConnection = empDbObj.con;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Display Employee");
            System.out.println("4. Exit");
            try {
                int n = sc.nextInt();

                switch (n) {
                case 1:

                    System.out.println("1. Salaried Employee");
                    System.out.println("2. Hourly Employee");
                    System.out.println("3. Commission Employee");
                    System.out.println("4. Base Salaried Commision Employee");
                    int n1 = sc.nextInt();
                    sc.nextLine();
                    switch (n1) {
                    case 1:
                        System.out.println("enter name,email, phonenumber of Salaried Employee : ");
                        String name = sc.nextLine();
                        String email = sc.nextLine();
                        int phonenumber = sc.nextInt();
                        SalariedEmployee s = new SalariedEmployee(name, email, phonenumber);
                        empDbObj.insertRecord(s.getName(), s.getEmail(), s.getPhoneNumber(), "Salaried",
                                s.calculateSalary());

                        break;
                    case 2:
                        System.out.println("enter name, email, phonenumber and working hours of Hourly Employee: ");

                        String nameH = sc.nextLine();
                        String emailH = sc.nextLine();
                        int phonenumberH = sc.nextInt();
                        int hoursH = sc.nextInt();
                        HourlyEmployee h = new HourlyEmployee(nameH, emailH, phonenumberH, hoursH);
                        empDbObj.insertRecord(h.getName(), h.getEmail(), h.getPhoneNumber(), "Hourly",
                                h.calculateSalary());

                        break;

                    case 3:
                        System.out.println("enter name, email, phonenumber and sales of Commission Employee: ");

                        String nameE = sc.nextLine();
                        String emailE = sc.nextLine();
                        int phonenumberE = sc.nextInt();
                        double salesE = sc.nextInt();
                        CommissionEmployee c = new CommissionEmployee(nameE, emailE, phonenumberE, salesE);
                        empDbObj.insertRecord(c.getName(), c.getEmail(), c.getPhoneNumber(), "Commission",
                                c.calculateSalary());
                        break;

                    case 4:
                        System.out.println(
                                "enter name, email, phonenumber, and sales of BaseSalariedCommission Employee: ");

                        String nameB = sc.nextLine();
                        String emailB = sc.nextLine();
                        int phonenumberB = sc.nextInt();
                        double salesB = sc.nextInt();
                        BaseSalariedCommissionEmployee b = new BaseSalariedCommissionEmployee(nameB, emailB,
                                phonenumberB, salesB);

                        empDbObj.insertRecord(b.getName(), b.getEmail(), b.getPhoneNumber(), "BaseSalariedCommission",
                                b.calculateSalary());
                        break;
                    }
                case 2:
                    System.out.println("enter name of employee for which you want to delete record:");
                    try {
                        String name = sc.next();
                        empDbObj.deleteRecord(name);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("Enter employee name to find details: ");
                    String name = sc.next();
                    empDbObj.showRecord(name);
                    break;

                case 4:
                    System.out.println("Application Terminated Sucessfully");
                    System.exit(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
