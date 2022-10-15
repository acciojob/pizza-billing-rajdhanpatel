package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int extraChessPrice;
    private boolean isExtraCheeseAdded;

    private int extraToppicPrice;
    private boolean isExtraTopicAdded;

    private int takeawayBagPrice;
    private boolean isBagNeeded;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = getPrice();
        this.isBillGenerated = false;
        this.isExtraCheeseAdded = false;
        this.isExtraTopicAdded = false;
        this.isBagNeeded = false;
        this.extraChessPrice = 80;
        this.takeawayBagPrice = 20;
        if(isVeg==true){
            this.price = 300;
            this.extraToppicPrice = 70;
        }else{
            this.price = 400;
            this.extraToppicPrice = 120;
        }
        this.bill = "Base Price Of The Pizza:"+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isExtraCheeseAdded==false){
            this.bill = "Extra Cheese Added:"+this.extraChessPrice+"\n";
            this.price = this.price+this.extraChessPrice;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraTopicAdded==false){
            this.bill = "Extra Toppings Added:"+this.extraToppicPrice+"\n";
            this.price = this.price+this.extraToppicPrice;
            this.isExtraTopicAdded = true;
        }
    }

    public void addTakeaway(){
        if(isBagNeeded==false){
            this.bill = "Paperbag Added:"+this.takeawayBagPrice+"\n";
            this.price = this.price+this.takeawayBagPrice;
            this.isBagNeeded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated==false){
            this.bill = this.bill+"Total Price:"+this.price+"\n";
            this.isBillGenerated = true;
        }
        return this.bill;
    }
}
