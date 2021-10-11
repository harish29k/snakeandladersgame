package snakeandladers;


	/*
	*The Player rolls the die to get a number between 1 to 6. 
	*/
     public class RollDiceUC2 {
		public static void main(String[] args) {

			// to roll a dice
			int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
			System.out.println("diceNumber is : " + diceNumber);

		}

	}



