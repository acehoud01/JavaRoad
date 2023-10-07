public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		//three player objects for the game
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//varibles to hold the guesses by a player
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//variables to hold true or false based on palyer's answer
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		//generate a random number between 0 and 9 to be guessed
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number a number between 0 and 9...");

		while (true) {
			System.out.println("Number to guess is " + targetNumber);

			//calling each players guess method
			p1.guess();
			p2.guess();
			p3.guess();
			
			//get each player's guess by acceessing the number variable of each player
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);


                        guessp2 = p2.number;
                        System.out.println("Player one guessed " + guessp2);


                        guessp3 = p3.number;
                        System.out.println("Player one guessed " + guessp3);

			/*Check each player’s guess to see if it
			matches the target number. If a player is
			right, then set that player’s variable to be
			true.
			*/

			if (guessp1 == targetNumber) {
				p1isRight = true;
			}

                        if (guessp2 == targetNumber) {
                                p2isRight = true;
                        }

                        if (guessp3 == targetNumber) {
                                p3isRight = true;
                        }

			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break; // game over, so break out of the loop
			} else {
				//continue with guesses
				System.out.println("Players will have to try again");
			}
		}
	}
}







