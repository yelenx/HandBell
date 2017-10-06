import java.awt.*;
import javax.swing.*;
public class Pidog extends JPanel {
	public void paintComponet (Graphics g) {
		g.setColor(Color.PINK);
		g.drawArc(350,0,300,200,0,180);
		g.setColor(new Color(255,240,245));
		
		g.setFont(new Font("Verdata", Font.ITALIC+Font.BOLD, 20));
		g.setColor(new Color(10, 255, 255));
        g.drawString("Hello, world!",350, 200);
		
		
		
		
		
		
		
		
		
		
		
	 }
	 
	 public static void main (String [] args) {
	 	JFrame app = new JFrame();
	 	app.add(new Pidog());
	 	app.setSize(700,500);
	 	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	app.setVisible(true);
	 	}
	}