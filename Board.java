import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Board extends Memorygame {
	private static int row;
	private static int col;

	public static int[][] board;

	public void size()
	{
		row = Integer.parseInt(JOptionPane.showInputDialog("How many number of rows?"));
		if(row % 2 != 0)
		{
			JOptionPane.showMessageDialog(null, "Must be an even number", "Alert", JOptionPane.ERROR_MESSAGE);
		}
		
		col = Integer.parseInt(JOptionPane.showInputDialog("How many number of columns?"));
		
		if(col % 2 != 0)
		{
			JOptionPane.showMessageDialog(null, "Must be an even number", "Alert", JOptionPane.ERROR_MESSAGE);
		}
		
	}	
	
	public static int getRow()
	{
		return row;
	}
	
	public static int getCol()
	{
		return col;
	}
	
	public void assign()
	{
		board = new int[row][col];
		int row = board.length;
		int col = board[0].length;
		int a = 0;
		int b = 0;
		ArrayList<Integer> set= new ArrayList<Integer>();
		for(int i = 0;i<(row*col)/2;i++)
		{
			set.add(i+1);
			set.add(i+1);
		}

		while(set.size()>0)
		{
			while(board[a][b]!=0)
			{
				a = (int)(Math.random()*row);
				b = (int)(Math.random()*col);
			}
			board[a][b]=set.remove(0);
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(board[i][j] + " ");
				//System.out.print("x ");
			}
			System.out.println("");
		}
	}
}
