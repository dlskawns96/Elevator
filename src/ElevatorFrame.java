import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ElevatorFrame {
	public static void main(String[] args)
	{
		Dimension dim = new Dimension(500,500);
	
		JFrame frame = new JFrame("Elevator");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
	
		DrawPanel draw = new DrawPanel();
		Font f = new Font(null,Font.BOLD,-1);
		JLabel l = new JLabel("asdf");
		l.setFont(f);
		draw.add(l);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(draw);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}


class DrawPanel extends JPanel
{
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Image img = Toolkit.getDefaultToolkit().getImage("elevator1.png");
	
		g.drawImage(img, 0, 0, this);
	}
}
