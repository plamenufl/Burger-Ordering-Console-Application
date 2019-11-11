package com.company;

public class DeluxeBurger extends Burger {

    //add chips and drink in constructor
    public DeluxeBurger(String name, String rolltype, String meat, double price, String drinkName, String chipsName) {
        super(name, rolltype, meat, price);
        Drink drink = new Drink(drinkName,2) ;
        Chips chips = new Chips(chipsName, 2);

        setDescription( drink.getName(), 1, drink.getPrice());
        setDescription( chips.getName(), 1, chips.getPrice());
    }

    public DeluxeBurger(String name, String rolltype, String meat, double price) {
        super(name, rolltype, meat, price);
    }

    @Override
    public void addLetuce() {

    }

    @Override
    public void addTomato() {

    }

    @Override
    public void addCarrot() {

    }

    @Override
    public void addPickle() {

    }
}

class Drink{
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Chips{
    private String name;
    private double price;

    public Chips(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
