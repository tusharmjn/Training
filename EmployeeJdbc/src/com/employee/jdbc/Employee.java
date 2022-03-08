package com.employee.jdbc;

public class Employee {
    protected String name;
    protected String email;
    protected int phoneNumber;
    protected int id;
    protected double sales;
    protected int hours;
    final int fixedSalary = 10000;
    final int hourly = 200;
    final int baseSalary = 2000;
    final int salesSalary = 3000;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String name, String email, int phoneNumber, int hours) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hours = hours;
    }

    public Employee(String name, String email, int phoneNumber, double sales) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double calculateSalary() {
        return 0;
    }

    public double calculateSalary(int x) {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", sales=" + sales
                + ", hours=" + hours + ", fixedSalary=" + fixedSalary + ", hourly=" + hourly + ", baseSalary="
                + baseSalary + ", salesSalary=" + salesSalary + "]";
    }
}
