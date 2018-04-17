import javax.swing.*;
import java.awt.*;

public class MineFieldPanel extends JPanel{
	private MineFieldButton[][] mineButtonArray;
	
	public MineFieldPanel(int width, int height) {
		mineButtonArray = new MineFieldButton[width][height];
		
		setLayout(new GridLayout(width, height));
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {

				MineFieldButton mineButton = new MineFieldButton();
				mineButtonArray[i][j] = mineButton;
				add(mineButton);
				
			}
		}
		
	}
	
	
}
