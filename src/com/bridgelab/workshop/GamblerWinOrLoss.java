package com.bridgelab.workshop;

public class GamblerWinOrLoss {
	//instance variable
	public static int stake = 100; //stake for every day
	public final int bet = 1; //bet for every game
	public static void checkGamblerWinLoss() {    //method definition
		//local variable
		int play=(int)(Math.random()*10)%2;
		System.out.println("Initial value of stake = "+stake);

		if(play == 1) {
			stake++;
			System.out.println("You won the game");
			System.out.println("new stake = "+stake);
		}
		else {
			stake--;
			System.out.println("You loss the game");
			System.out.println("new stake = "+stake);
		}
	}


	public static void main(String[] args) {
		System.out.println("Welcome to gambler simulator game");
		checkGamblerWinLoss(); //method calling
	}

}
