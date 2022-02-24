package com.employee.payroll;

class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, String email, int phoneNumber) {
        super(name, email, phoneNumber);
    }

    public double calculateSalary() {

        return fixedSalary;
    }
}
