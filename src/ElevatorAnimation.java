import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class ElevatorAnimation extends JFrame implements Runnable {
	Image[] img;
	String[] fileName;
	
	int i;
	
	Thread th;
	
	int index = -1;
	
	public ElevatorAnimation()
	{
		fileName = new String[5];
		img = new Image[5];
		for(i = 1; i<=5;i++)
		{
			fileName[i-1] = "elevator"+i+".png";
			img[i-1] = Toolkit.getDefaultToolkit().getImage(fileName[i-1]);
		}
		
		th = new Thread(this);
		th.start();
		
		setSize(800,800);
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img[index], 70, 70, this);
	}
	
	public void run()
	{
		while(true)
		{
			index++;
			
			if(index >=img.length)
				index = 0;
			
			try{
				th.sleep(100);
				repaint();
			}catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		new ElevatorAnimation();
	}
	
	
}
