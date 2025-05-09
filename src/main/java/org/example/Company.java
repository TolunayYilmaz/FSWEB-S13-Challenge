package org.example;

public class Company {


    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {

        this.id = id;
        this.name = name;
        this.developerNames = developerNames;
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public void addEmployee(int index, String name) {
        if (index < 0) {
            System.out.println("Geçersiz index");
        } else if (this.developerNames[index] != null) {

            System.out.println("İçeride değer var");

        } else {
            this.developerNames[index] = name;
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return this.giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return this.developerNames;
    }

    public String toString() {

        return "Tam ad " + this.name + "Giro: " + this.giro;
    }
}
