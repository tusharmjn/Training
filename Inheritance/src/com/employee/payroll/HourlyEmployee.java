package com.employee.payroll;

class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, String email, int phoneNumber, int hours) {
        super(name, email, phoneNumber, hours);
//        this.setHours(hours);
    }

//    public HourlyEmployee() {
//        Scanner sc = new Scanner(System.in);
//        HourlyEmployee h = new HourlyEmployee();
//        int Hours = sc.nextInt();
//        h.setHours(Hours);
//        h.getHours();
//    }

    public double calculateSalary() {

        if (hours > 40)
            return (40 * hourly + (hours - 40) * 1.5 * hourly);
        else
            return hours * hourly;
    }
}