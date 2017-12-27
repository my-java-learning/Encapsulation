package com.example;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
	    player.fullname = "Tim";
	    //player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.looseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
		player.looseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
    }
}
