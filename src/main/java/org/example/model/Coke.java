package org.example.model;

public class Coke extends ProductForSale {

    private double volume;

    public Coke(String type, double price, String description, double volume) {
        super(type, price, description);
        this.volume = volume;
    }
    @Override
    public void showDetails() {
        System.out.println(getType());
        System.out.println(getDescription());
        System.out.println(getPrice());
        System.out.println(volume);
    }
}
