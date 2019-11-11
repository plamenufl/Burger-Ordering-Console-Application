package com.company;

public class Burger {

    private String name;
    private String rolltype;
    private String meat;
    private double price;
    private double totalPrice;
    private String description = "";
    private int itemCount = 0;
    private boolean additions = false;


    public Burger(String name, String rolltype, String meat, double price) {
        this.name = name;
        this.rolltype = rolltype;
        this.meat = meat;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String getRolltype() {
        return rolltype;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setTotalPrice(double price) {
        if(!additions){
            totalPrice += this.getPrice() + price;
            additions = true;
        }else{
            totalPrice += price;
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount++;
}
    public void setDescription(String name, int count, double price) {

        setItemCount(count);
        setTotalPrice(price);
        this.description += "Item added to burger: " + name+ " with price " + price+ "\n";


    }

    //in a method name SetDescription here pass in the object price, and count, name
    public String getDescription() {
        return this.description;
    }



 public void addLetuce(){

        Lettuce lettuce = new Lettuce();
        setDescription( lettuce.getName(), 1, lettuce.getPrice());

        //totalPrice += this.getPrice() + lettuce.getPrice();
        //setTotalPrice(lettuce.getPrice());
        //itemCount++
        //description += "Items added to burger: " + lettuce.getName() + " with price " + lettuce.getPrice() + "\n";

    }

    public void addTomato(){

        Tomato tomato = new Tomato();
        setDescription( tomato.getName(), 1, tomato.getPrice());


    }

    public void addCarrot(){
        Carrot carrot = new Carrot();
        setDescription(carrot.getName(),1,carrot.getPrice());
    }

    public void addPickle(){
        Pickle pickle = new Pickle();
        setDescription(pickle.getName(),1,pickle.getPrice());
    }

    public String fullDescription(){

        if(this.getTotalPrice() == 0){
           return  this.getName() + " burger has " + this.getRolltype() + " roll with " + this.getMeat() + " meat and base price of " + this.getPrice() +
                    "\nWith item count " + this.getItemCount() + " Total price " + this.getPrice() +"\n\n\n";
        }else{

        } return  this.getName() + " burger has " + this.getRolltype() + " roll with " + this.getMeat() + " meat and base price of " + this.getPrice()
                + " \n\n" + this.getDescription() +
                "\nWith item count " + this.getItemCount() + " Total price " + this.getTotalPrice() +"\n\n\n";

    }


}
