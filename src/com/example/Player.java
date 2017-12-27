package com.example;

public class Player {

    public String fullname;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
