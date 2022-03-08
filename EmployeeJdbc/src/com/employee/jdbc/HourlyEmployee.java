package com.employee.jdbc;



class HourlyEmployee extends Employee {

//    public static Logger log = LogManager.getLogger(HourlyEmployee.class);

    public HourlyEmployee(String name, String email, int phoneNumber, int hours) {

        super(name, email, phoneNumber, hours);
//        log.info("Constructor for HourlyEmployee Created");
    }

    public double calculateSalary() {

        if (hours > 40)
            return (40 * hourly + (hours - 40) * 1.5 * hourly);
        else
            return hours * hourly;
    }
}