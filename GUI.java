import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Image;

public class GUI extends JFrame{

	private int rows;
	private int columns;
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	JTextField jt = new JTextField(30);
	JTextArea statsOut = new JTextArea(30,35);
	//JButton jb = new JButton("Enter");
	
	public void addLabels(){
		
	}


	public static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame;
		frame = new JFrame("Memory Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon Icon = new ImageIcon("src/nickypic.jpg"); 
		JPanel panel = new JPanel(new GridLayout(Board.getRow(),Board.getCol(), 10,10));

		JLabel labels[] = new JLabel[(Board.getRow()*Board.getCol())];
		Image scaleIcon= Icon.getImage().getScaledInstance(((1100/Board.getRow())-(10*Board.getRow())), ((800/Board.getCol())-(10*Board.getCol())), Image.SCALE_DEFAULT);
		
		ImageIcon newScaledImage = new ImageIcon(scaleIcon);

		for (int i =  0; i < Board.getRow()*Board.getCol(); i++)
		{

			labels[i] = new JLabel(newScaledImage );
			panel.add(labels[i]);
		}
		/**
		JLabel lbl1 = new JLabel("0");
		JLabel lbl2 = new JLabel("1");
		JLabel lbl3 = new JLabel("2");
		JLabel lbl4 = new JLabel("3");
		JLabel lbl5 = new JLabel("4");

		frame.add(lbl1);
		frame.add(lbl2);
		frame.add(lbl3);
		frame.add(lbl4);
		frame.add(lbl5);

		lbl1.setLocation(10, 20);
		lbl2.setLocation(10, 40);
		lbl3.setLocation(10, 60);
		lbl4.setLocation(10, 80);
		lbl5.setLocation(10, 100);

		lbl1.setSize(100, 100);
		lbl2.setSize(10, 10);
		lbl3.setSize(10, 10);
		lbl4.setSize(10, 10);
		lbl5.setSize(10, 10);
		*/
		
		
		//Size and display the window.
		Insets insets = frame.getInsets();
		frame.setSize(1100 + insets.left + insets.right,
				800 + insets.top + insets.bottom);
		frame.setBackground(Color.ORANGE);
		frame.add(panel);
		//frame.setVisible(true);
		frame.setVisible(true);
	}


}

