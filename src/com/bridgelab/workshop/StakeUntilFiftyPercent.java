package com.bridgelab.workshop;

public class StakeUntilFiftyPercent {
	// static variable & final variables
	public static int stake = 100; // stake for every day
	public static final int BET = 1; // bet for every game

	/*
	 * computing win and loss using random function in gambler simulator game
	 */
	public static void checkGamblerWinLoss() { // method definition
		// local variable
		while (stake != 50 && stake != 150) {
			int play = (int) (Math.random() * 10) % 2;
			if (play == BET)
				stake++;
			else
				stake--;
			System.out.println("stake = " + stake);
		}
		System.out.println("new stake = " + stake);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to gambler simulator game");
		checkGamblerWinLoss();// calling method
	}

}
