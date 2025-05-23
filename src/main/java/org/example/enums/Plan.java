package org.example.enums;

public enum Plan {
    BASIC("Basic", 9),
    STANDARD("Standard", 10),
    PREMIUM("Premium", 30);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return this.price;
    }
}
