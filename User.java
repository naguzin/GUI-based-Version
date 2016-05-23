import java.util.Scanner;

import javax.swing.JOptionPane;



public class User extends Memorygame

{

	private static int guess1x;

	private static int guess2x;

	private static int guess1y;

	private static int guess2y;

	public void guess1()

	{

		int guess1x = Integer.parseInt(JOptionPane.showInputDialog("X coordinate of first guess (starts at zero)"));

		while(guess1x > Board.getCol()-1);

		int guess1y = Integer.parseInt(JOptionPane.showInputDialog("Y coordinate of first guess (starts at zero)"));

		while(guess1y > Board.getRow()-1);

		//System.out.println(Board.board[guess1x][guess1y]);
		JOptionPane.showMessageDialog(null, "Your guess is: " +Board.board[guess1x][guess1y]);

		//if(guess1x > Board.getRow()-1 || guess1y > Board.getCol()-1){
			//FIX OUT OF BOUNDS PROBLEM
		//}
	}


	public void guess2()

	{

		int guess2x = Integer.parseInt(JOptionPane.showInputDialog("X coordinate of second guess (starts at zero)"));

		while(guess2x > Board.getCol()-1);

		int guess2y = Integer.parseInt(JOptionPane.showInputDialog("Y coordinate of second guess (starts at zero))"));

		while(guess2y > Board.getRow()-1);

		//System.out.println(Board.board[guess2x][guess2y]);
		JOptionPane.showMessageDialog(null, "Your guess is: " +Board.board[guess2x][guess2y]);

		
		//THINGS TO DO
		//1. SWTICH X AND Y GUESSES, WHEN YOU GUESS IT CHANGES THEM
		//2. FIX OUT OF BOUNDS PROBLEM
		//3. DISPLAY NUMBER ON BOARD
		//4. DISPLAY 0123 ETC ALOND THE SIDES OF THE BOARD TO MAKE IT EASIER TO GUESS
		
	}

	public int getGuess1(){
		return Board.board[guess1x][guess1y];
	}
	public int getGuess2(){
		return Board.board[guess2x][guess2y];
	}

}

