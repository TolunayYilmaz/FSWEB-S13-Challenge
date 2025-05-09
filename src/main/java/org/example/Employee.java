package org.example;

public class Employee {

    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0) {
            System.out.println("Geçersiz index");
        } else if (this.healthPlans[index] != null) {

            System.out.println("İçeride değer var");

        } else {
            this.healthPlans[index] = name;
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.email;
    }

    public void setPassword(String password) {
        this.email = password;
    }

    public String[] getHealthPlans() {
        return this.healthPlans;
    }

    public String toString() {

        return "Tam ad " + this.fullName + "email: " + this.email;
    }
}
