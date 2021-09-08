package com.company;

public class Main {

    public static void main(String[] args) {

    	boolean gameOver = true;
    	int score = 800;
    	int levelCompleted = 5;
    	int bonus = 100;

    	int scorePosition;

//	   	int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//		System.out.println("Your final score was " + highScore);
//
//	    score = 10000;
//	    levelCompleted = 8;
//	    bonus = 200;
//
//		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//		System.out.println("Your final score was " + highScore);

		scorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Carlos", scorePosition);

		scorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Tom", scorePosition);

		scorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Jane", scorePosition);

		scorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Bill", scorePosition);



	}

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//
//		if (gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			finalScore += 2000;
//			return finalScore;
//		}
//			return -1;
//	}


	public static void displayHighScorePosition(String playerName, int scoreLevel){
		System.out.println(playerName + " managed to get into position " + scoreLevel + " on the high score table.");

	}

	public static int calculateHighScorePosition(int playerScore){

    	if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}

	}



}
