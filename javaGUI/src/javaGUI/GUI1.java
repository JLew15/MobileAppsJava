package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI1 implements ActionListener{
	static int numClicks;
	static JLabel myLabel = new JLabel("This is a label");
	static JLabel Reward = new JLabel();
	public GUI1() {
		JFrame frame = new JFrame();
		FlowLayout flowlayout = new FlowLayout();
		frame.setLayout(flowlayout);
		frame.setTitle("Welcome to the soldier side.");
		frame.setSize(500,500);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(myLabel);
		
		Button myButton = new Button("dakjfas");
		myButton.addActionListener(this);
		
		frame.add(myButton);
		frame.add(Reward);
		
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI1();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		numClicks++;
		myLabel.setText("Button clicked "+Integer.toString(numClicks)+" times");
		if(numClicks % 100 == 0) {
			
			Reward.setText("YOU GOT A REWARD!");
			numClicks += 10;
		}
		else {
			Reward.setText("");
		}
		
	}

}
