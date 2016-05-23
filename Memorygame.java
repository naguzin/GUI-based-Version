
public class Memorygame {

	public static void main(String[] args) 

	{
		GUI newgui =new GUI();
		GameWorks newrun = new GameWorks();
		Board newBoard = new Board();



		newBoard.size();
		newgui.createAndShowGUI();
		newBoard.assign();
		newrun.game();



	}

}