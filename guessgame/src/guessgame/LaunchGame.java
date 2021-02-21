package guessgame;

import java.util.*;

class Guesser {
	int gnum;

	int guessNum() {
		System.out.println("guesser kindly guess the number");
		Scanner scan = new Scanner(System.in);
		gnum = scan.nextInt();
		return gnum;
	}
}

class Player {
	int pnum;

	int guessNum() {
		System.out.println("player kindly guess the number");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
	}
}

class Umpire {
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numfromguesser = g.guessNum();
	}

	void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numfromplayer1 = p1.guessNum();
		numfromplayer2 = p2.guessNum();
		numfromplayer3 = p3.guessNum();
	}

	void compare() {
		if (numfromguesser == numfromplayer1) {
			System.out.println("player 1 is winner");
		} else if (numfromguesser == numfromplayer2) {
			System.out.println("player 2 is winner");
		} else if (numfromguesser == numfromplayer3) {
			System.out.println("player 3 is winner");
		} else {
			System.out.println("game lost");
		}
	}

}

class LaunchGame {
	static public void main(String[] args) {
		Umpire U = new Umpire();
		U.collectNumFromGuesser();
		U.collectNumFromPlayer();
		U.compare();
	}
}