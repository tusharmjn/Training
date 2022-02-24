package com.employee.payroll;

class CommissionEmployee extends Employee {

    public CommissionEmployee(String name, String email, int phoneNumber, double sales) {
        super(name, email, phoneNumber, sales);
    }

    public double calculateSalary() {
        return (0.15 * sales);
    }
}