import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class GameWorks extends User{

	public boolean gameInProgress=true;
	int score=0;


	public void gameRun(){

		if(getGuess1()!=getGuess2()){

			JOptionPane.showMessageDialog(null, "The cards did not match, guess again.", "WHOOPS", JOptionPane.ERROR_MESSAGE);
		}


		else if(getGuess1()==getGuess2()){
			score++;
			JOptionPane.showMessageDialog(null, "Your Socre is: "+ score, "NEW SCORE", JOptionPane.ERROR_MESSAGE);
			//System.out.println("That is a match, your score is: "+ score);
			if(score==(Board.getRow()*Board.getCol())/2){
				JOptionPane.showMessageDialog(null, "You Won!, you found all "+ score + " matches", "YOU WON!!!", JOptionPane.ERROR_MESSAGE);
				gameInProgress=false;
			}
		}


	}


	public void game(){
		while(gameInProgress){
			User newPlayer= new User();
			newPlayer.guess1();
			newPlayer.guess2();
			gameRun();
		}
	}

}

