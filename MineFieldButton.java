import javax.swing.*;
import java.awt.*;

public class MineFieldButton extends JButton{
	
	private Color[] buttonColors = new Color[]{Color.RED, Color.ORANGE,Color.YELLOW, Color.GREEN, Color.BLUE, Color.WHITE, Color.BLACK};
	
	public MineFieldButton(){
		setBackground(buttonColors[5]);
		setOpaque(true);
	}

}
