import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class MineWalkerPanel extends JPanel{
	
	private JFrame frame;
	private JPanel colorKeyPanel;
	private JPanel scoreBoard;
	private JPanel walkerBoard;
	private JPanel options;

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JLabel labelScore;
	private JLabel labelLives;
	
	private int width = 1000;
	private int height = 900;
	
	private MineFieldPanel mineField;
	
	public MineWalkerPanel(int mineHeight, int mineWidth, int width, int height) {
		
		walkerBoard = new MineFieldPanel(mineHeight, mineWidth); 

		
		colorKeyPanel = new JPanel();
		colorKeyPanel.setBackground(Color.GRAY);
		
		scoreBoard = new JPanel();
		scoreBoard.setBackground(Color.BLUE);
		
		options = new JPanel();
		options.setBackground(Color.YELLOW);
		
		button1 = new JButton("Show Mines");
		button2 = new JButton("Show Path");
		button3 = new JButton("Give Up");
		
		labelLives = new JLabel("Lives = 5");
		labelScore = new JLabel("Score = 100");
		
		
		JLabel label1 = new JLabel("  0 Nearby Mines");
		label1.setFont(new Font("Serif", Font.PLAIN, 10));
		label1.setBackground(Color.GREEN);
		label1.setOpaque(true);
		
		JLabel label2 = new JLabel("  1 Nearby Mines");
		label2.setFont(new Font("Serif", Font.PLAIN, 10));
		label2.setBackground(Color.YELLOW);
		label2.setOpaque(true);
		
		JLabel label3 = new JLabel("  2 Nearby Mines");
		label3.setFont(new Font("Serif", Font.PLAIN, 10));
		label3.setBackground(Color.ORANGE);
		label3.setOpaque(true);
		
		JLabel label4 = new JLabel("  3 Nearby Mines");
		label4.setFont(new Font("Serif", Font.PLAIN, 10));
		label4.setBackground(Color.RED);
		label4.setOpaque(true);
		
		JLabel label5 = new JLabel("  Exploded Mine");
		label5.setFont(new Font("Serif", Font.PLAIN, 10));
		label5.setBackground(Color.BLACK);
		label5.setOpaque(true);
	
		options.add(button1);
		options.add(button2);
		options.add(button3);
		
		scoreBoard.add(labelLives);
		labelLives.setOpaque(true);
		scoreBoard.add(labelScore);
		labelScore.setOpaque(true);
		
		colorKeyPanel.add(label1);
		colorKeyPanel.add(label2);
		colorKeyPanel.add(label3);
		colorKeyPanel.add(label4);
		colorKeyPanel.add(label5);
		
		label1.setPreferredSize(new Dimension(width/10, height/10));
		label2.setPreferredSize(new Dimension(width/10, height/10));
		label3.setPreferredSize(new Dimension(width/10, height/10));
		label4.setPreferredSize(new Dimension(width/10, height/10));
		label5.setPreferredSize(new Dimension(width/10, height/10));
		
		colorKeyPanel.setPreferredSize(new Dimension(width/10, (height/8)*7));
		scoreBoard.setPreferredSize(new Dimension(width/10, (height/8)*7));
		options.setPreferredSize(new Dimension(width, height/9));
		walkerBoard.setPreferredSize(new Dimension((width/10)*7, (height/8)*7));
		
		
		this.add(colorKeyPanel, BorderLayout.WEST);
		this.add(walkerBoard, BorderLayout.CENTER);
		this.add(scoreBoard, BorderLayout.EAST);
		this.add(options, BorderLayout.SOUTH);
		
		
	}
	
	
}
