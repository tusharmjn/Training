package com.employee.payroll;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class BaseSalariedCommissionEmployee extends Employee {

    public static Logger log = LogManager.getLogger(BaseSalariedCommissionEmployee.class);

    public BaseSalariedCommissionEmployee(String name, String email, int phoneNumber, double sales) {

        super(name, email, phoneNumber, sales);
        log.info("Constructor for BaseSalariedCommissionEmployee Created");
    }

    public double calculateSalary() {
        return (0.1 * baseSalary) + (0.12 * sales);
    }

}