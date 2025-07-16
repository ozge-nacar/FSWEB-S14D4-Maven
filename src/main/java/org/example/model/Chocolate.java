package org.example.model;

public class Chocolate extends ProductForSale {
private String milkChocolate;

    public Chocolate(String type, double price, String description, String milkChocolate) {
        super(type, price, description);
        this.milkChocolate = milkChocolate;
    }
        @Override
        public void showDetails() {
            System.out.println(getType());
            System.out.println(getDescription());
            System.out.println(getPrice());
            System.out.println(milkChocolate);
        }
    }
