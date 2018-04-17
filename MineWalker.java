import javax.swing.*;
import java.awt.*;

public class MineWalker {
	

	private JPanel colorKeyPanel;
	private JPanel scoreBoard;
	private JPanel walkerBoard;
	private JPanel options;

	private JButton button;
	private JLabel label;

	public static void main(String[] args) {		
		
		JFrame frame = new JFrame("MineWalker Thing");
		frame.setVisible(true);
		frame.setSize(1000, 900);
		int width = frame.getWidth();
		int height = frame.getHeight();
		System.out.println(width);
		System.out.println(height);
		frame.getContentPane().add(new MineWalkerPanel(10, 10, width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
