package com.example;

public class Player {

    public String fullname;
    public int hitPoints;
    public String weapon;

    public void looseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.hitPoints;
    }
}
