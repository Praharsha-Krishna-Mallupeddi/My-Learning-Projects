
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorMixer extends JFrame implements AdjustmentListener
{
	JLabel lred, lgreen, lblue;
	JScrollBar red, green, blue;
	JPanel p1, p2;
	
	ColorMixer()
	{
		super("Color Mixer");
		setBounds(100, 100, 400, 300);
		
		p1 = new JPanel(new GridLayout(3, 2, 5, 5));
		lred = new JLabel("Red: 0");
		p1.add(lred);
		red = new JScrollBar(JScrollBar.HORIZONTAL);
		red.setMaximum(256);
		//red.setBlockIncrement(1);
		red.addAdjustmentListener(this);
		p1.add(red);
		
		lgreen = new JLabel("Green: 0");
		p1.add(lgreen);
		green = new JScrollBar(JScrollBar.HORIZONTAL);
		green.setMaximum(256);
		//green.setBlockIncrement(16);
		green.addAdjustmentListener(this);
		p1.add(green);

		lblue = new JLabel("Blue: 0");
		p1.add(lblue);
		blue = new JScrollBar(JScrollBar.HORIZONTAL);
		blue.setMaximum(256);
		//blue.setBlockIncrement(16);
		blue.addAdjustmentListener(this);
		p1.add(blue);

		add(p1, "North");
		
		p2 = new JPanel();
		p2.setBackground(new Color(0, 0, 0));
		add(p2, "Center");
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r = red.getValue();
		int g = green.getValue();
		int b = blue.getValue();
		
		lred.setText("Red: " + r);
		lgreen.setText("Green: " + g);
		lblue.setText("Blue: " + b);
		
		p2.setBackground(new Color(r, g, b));
	}
	
	public static void main(String[] args)
	{
		(new ColorMixer()).setVisible(true);
	}
}