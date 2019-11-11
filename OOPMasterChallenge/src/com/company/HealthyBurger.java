package com.company;

public class HealthyBurger extends Burger {

    public HealthyBurger(String name,  String meat, double price) {
        super(name, "brown rye", meat, price);
    }

    public void addOnion(){

        Onion onion = new Onion();
        setDescription( onion.getName(), 1, onion.getPrice());
    }

    public void addEgg(){

        Egg egg = new Egg();
        setDescription( egg.getName(), 1, egg.getPrice());
    }


}

 class Onion{

     private String name;
     private double price;

     public Onion() {
         this.name = "onion";
         this.price = 0.4;
     }

     public String getName() {
         return name;
     }

     public double getPrice() {
         return price;
     }
 }

 class Egg{
     private String name;
     private double price;

     public Egg() {
         this.name = "egg";
         this.price = 1.0;
     }

     public String getName() {
         return name;
     }

     public double getPrice() {
         return price;
     }
 }


