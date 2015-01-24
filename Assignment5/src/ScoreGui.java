import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * 
 * @author Christopher Hall
 *Purpose: allow the user to enter their test scores and score weight to determine the weighted average 
 */

public class ScoreGui extends JFrame implements ActionListener {
	JTextField [] jtxtScore = new JTextField[4];
	JTextField [] jtxtWeight = new JTextField[4];
	JButton  jbtnCalScore = new JButton("Calcuate Score");
	JPanel jpnlScore = new JPanel(new GridLayout(5,2));
	JTextField jtxtDisplay = new JTextField();
	//panel.setLayout(new GridLayout(5,2));
	/**
	 *  Builds the panel layout with buttons and text boxes for user to enter score and score weights
	 */
	
	int [] score = new int [4];
	double [] weight = new double [4];
	public ScoreGui() {
		for(int i=0; i<jtxtScore.length; i++) {
			jtxtScore[i] = new JTextField(6);
			jtxtWeight[i] = new JTextField(6);
			jpnlScore.add(jtxtScore[i]);
			jpnlScore.add(jtxtWeight[i]);
			/**
			 * adds score and weight to panel in loop form
			 */
		}
		jbtnCalScore.addActionListener(this);
		add(jtxtDisplay, BorderLayout.NORTH);
		add(jpnlScore, BorderLayout.CENTER);
		add(jbtnCalScore, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		/**
		 * sets the border layout of display, Score panel, and calculator button
		 */
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		for(int i=0; i<score.length; i++){
		score[i] = Integer.parseInt(jtxtScore[i].getText());
		weight[i] = Double.parseDouble(jtxtWeight[i].getText());
	}
		jtxtDisplay.setText(ScoreCalculator.CalScore(score, weight)+"");
		/**
		 * tests the program seeing if it works 
		 */
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ScoreGui();
		/**
		 * generates a new class for the panel
		 */
	}

}
