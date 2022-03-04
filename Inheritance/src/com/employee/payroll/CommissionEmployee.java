package com.employee.payroll;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class CommissionEmployee extends Employee {

    public static Logger log = LogManager.getLogger(CommissionEmployee.class);

    public CommissionEmployee(String name, String email, int phoneNumber, double sales) {

        super(name, email, phoneNumber, sales);
        log.info("Constructor for CommissionEmployee Created");

    }

    public double calculateSalary() {
        return (0.15 * sales);
    }
}