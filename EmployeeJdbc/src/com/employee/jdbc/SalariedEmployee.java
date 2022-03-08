package com.employee.jdbc;

class SalariedEmployee extends Employee {

//    public static Logger log = LogManager.getLogger(SalariedEmployee.class);

    public SalariedEmployee(String name, String email, int phoneNumber) {

        super(name, email, phoneNumber);
//        log.info("Constructor for SalariedEmployee Created");
    }

    public double calculateSalary() {

        return fixedSalary;
    }
}
