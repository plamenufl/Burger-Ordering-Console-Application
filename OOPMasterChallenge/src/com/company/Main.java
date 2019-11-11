package com.company;

public class Main {

    public static void main(String[] args) {

        //add price to constructor later
        Burger base = new Burger("Base","wheat","turkey", 6);

        System.out.println(base.fullDescription());

        base.addLetuce();
        base.addTomato();
        base.addPickle();
        base.addCarrot();

        System.out.println(base.fullDescription());


       HealthyBurger healthyBurger = new HealthyBurger("Healthy","chicken",7);

       healthyBurger.addCarrot();
       healthyBurger.addEgg();
       healthyBurger.addLetuce();
       healthyBurger.addOnion();
       healthyBurger.addTomato();
      System.out.println(healthyBurger.fullDescription());

      DeluxeBurger  deluxeBurger = new DeluxeBurger("Deluxe", "white","pork",8,"coke", "Doritos");

      System.out.println(deluxeBurger.fullDescription());


    }
}
