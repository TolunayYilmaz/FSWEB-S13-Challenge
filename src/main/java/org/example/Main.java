package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {


        Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        String[] healthplans = new String[2];
        healthplans[0] = healthplan.getName();
         Employee  employee = new Employee(1, "John Doe", "jd@test.com", "1234", healthplans);

        String[] employees = new String[2];
        employees[0] = employee.getFullName();
        Company company = new Company(1, "Workintech", 1000, employees);
    }
}