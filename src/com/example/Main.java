package com.example;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.fullname = "Tim";
//	    //player.hitPoints = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.looseHealth(damage);
//        System.out.println("Remaining hitPoints = " + player.healthRemaining());
//
//        damage = 11;
//        player.hitPoints = 200;
//		player.looseHealth(damage);
//		System.out.println("Remaining hitPoints = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 250, "Sword");
        System.out.println("Initial hitPoints is " + enhancedPlayer.getHealth());
    }
}
