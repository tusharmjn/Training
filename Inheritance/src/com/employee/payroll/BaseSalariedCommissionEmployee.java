package com.employee.payroll;

class BaseSalariedCommissionEmployee extends Employee {

    public BaseSalariedCommissionEmployee(String name, String email, int phoneNumber, double sales) {
        super(name, email, phoneNumber, sales);
    }

    public double calculateSalary() {
        return (0.1 * baseSalary) + (0.12 * sales);
    }

}