import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class ElevatorGUI extends JFrame {

	private JPanel contentPane = new JPanel();
	private JLabel firstElevator[] = new JLabel[10];
	private JLabel secondElevator[] = new JLabel[10];
	private JLabel thirdElevator[] = new JLabel[10];
	
	private Image img = Toolkit.getDefaultToolkit().getImage("elevator.png");
	private ImageIcon elevatorIcon = new ImageIcon(img);
	
	
	private static int curFloor[] = new int[3];
	
	/**
	 * Launch the application.
	 */	

	public  void run() {
		
		curFloor[0] = 0;
		curFloor[1] = 0;
		curFloor[2] = 0;
		
		try {
			ElevatorGUI frame = new ElevatorGUI();	
			frame.setTitle("Elevator Statement");
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Create the frame.
	 */
	public ElevatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 845);
		Color col = new Color(255,255,255);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		contentPane.setBackground(col);
		Border border = LineBorder.createBlackLineBorder();
		
		
		for(int i = 0;i<10;i++)
		{	
			firstElevator[9 - i] = new JLabel();
			firstElevator[9 - i].setBorder(border);
			firstElevator[9 - i].setBounds(0, 80*i, 72, 80);
			contentPane.add(firstElevator[9 - i]);
			
			secondElevator[9 - i] = new JLabel();
			secondElevator[9 - i].setBorder(border);
			secondElevator[9 - i].setBounds(75, 80*i, 72, 80);
			contentPane.add(secondElevator[9 - i]);
			
			thirdElevator[9 - i] = new JLabel();
			thirdElevator[9 - i].setBorder(border);
			thirdElevator[9 - i].setBounds(150, 80*i, 72, 80);
			contentPane.add(thirdElevator[9 - i]);
		}
		firstElevator[0].setIcon(elevatorIcon);
		secondElevator[0].setIcon(elevatorIcon);
		thirdElevator[0].setIcon(elevatorIcon);		
	
	}
	
	public void setElevator(int n, int k)
	{
		if(n == 1)
		{
			
			firstElevator[curFloor[0]].setIcon(null);
			firstElevator[k - 1].setIcon(elevatorIcon);
			curFloor[0] = k -1;
		}
		else if(n == 2)
		{
			secondElevator[curFloor[1]].setIcon(null);
			secondElevator[k-1].setIcon(elevatorIcon);
			curFloor[1] = k -1;
		}
		else
		{
			thirdElevator[curFloor[2]].setIcon(null);
			thirdElevator[k-1].setIcon(elevatorIcon);
			curFloor[2] = k -1;
		}
		
		setVisible(false);
		setVisible(true);
		
	}
}
