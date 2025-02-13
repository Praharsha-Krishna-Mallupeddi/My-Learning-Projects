import java.applet.Applet; 
import java.awt.Color; 
import java.awt.Graphics; 
/*
<applet code="HouseApplet" width=670 height=300>
</applet>
 */
 
public class HouseApplet extends Applet { 
 
public void paint(Graphics g) { 
// Draw the house walls 
g.setColor(Color.red); 
g.fillRect(100, 100, 200, 200); 
 
// Draw the door 
g.setColor(Color.blue); 
g.fillRect(150, 200, 50, 100); 
 
// Draw the roof 
g.setColor(Color.green); 
int[] xPoints = {50, 200, 350}; 
int[] yPoints = {100, 0, 100}; 
g.fillPolygon(xPoints, yPoints, 3); 
 
// Draw the windows 
g.setColor(Color.yellow); 
g.fillRect(125, 150, 25, 25); 
g.fillRect(225, 150, 25, 25); 
}
