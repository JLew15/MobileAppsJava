package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUI1 implements ActionListener{
	static int numClicks;
	static int monsterTimes;
	static JLabel myLabel = new JLabel("This is a label");
	static JLabel Reward = new JLabel();
	static JFrame frame = new JFrame();
	static FlowLayout flowlayout = new FlowLayout();
	int fontSize = 10;
	Button myButton;
	public GUI1() {
		frame.setLayout(flowlayout);
		frame.setTitle("Welcome to the soldier side.");
		frame.setSize(500,500);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(myLabel);
		
		myButton = new Button("Clicks "+ Integer.toString(numClicks));
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
		myButton.setLabel("Clicks "+ Integer.toString(numClicks));
		myLabel.setText("Button clicked "+Integer.toString(numClicks)+" times");
		if(numClicks % 10 == 0) {
			myButton.setFont(new Font("FONT",Font.PLAIN, ++fontSize));
		}
		if(numClicks >= 100) {
			frame.getContentPane().setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null,"You reached 100 clicks at "+ Calendar.getInstance().getTime());
		}
		else if(numClicks >= 75) {
			frame.getContentPane().setBackground(Color.YELLOW);
		}
		else if (numClicks >= 50) {
			frame.getContentPane().setBackground(Color.BLUE);
		}
		else if (numClicks >= 25) {
			frame.getContentPane().setBackground(Color.RED);
		}
		/*if(numClicks % 100 == 0 && numClicks % 1000 != 0 && numClicks % 10000 != 0) {
			
			Reward.setText("YOU GOT A REWARD!");
			numClicks += 10;
			frame.getContentPane().setBackground(Color.GREEN);
			myButton.setLabel("Clicks "+ Integer.toString(numClicks));
			myLabel.setText("Button clicked "+Integer.toString(numClicks)+" times");
		}
		else if(numClicks % 1000 == 0 && numClicks % 10000 != 0) {
			Reward.setText("YOU GOT A REWARD AND YOU ARE AMAZING!");
			numClicks += 110;
			frame.getContentPane().setBackground(Color.YELLOW);
			myButton.setLabel("Clicks "+ Integer.toString(numClicks));
			myLabel.setText("Button clicked "+Integer.toString(numClicks)+" times");
		}
		else if(numClicks % 10000 == 0 && monsterTimes < 3) {
			Reward.setText("You are a monster...");
			numClicks = 0;
			monsterTimes ++;
			frame.getContentPane().setBackground(Color.RED);
			myButton.setLabel("Clicks "+ Integer.toString(numClicks));
			myLabel.setText("Button clicked "+Integer.toString(numClicks)+" times");
		}
		else if(numClicks % 10000 == 0 && monsterTimes >= 3) {
			Reward.setText("You are absolutely insane...");
			numClicks = 0;
			monsterTimes = 0;
			Button decoy1 = new Button("dakjfas");
			Button decoy2 = new Button("dakjfas");
			Button decoy3 = new Button("dakjfas");
			Button decoy4 = new Button("dakjfas");
			Button decoy5 = new Button("dakjfas");
			Button decoy6 = new Button("dakjfas");
			frame.add(decoy1);
			frame.add(decoy2);
			frame.add(decoy3);
			frame.add(decoy4);
			frame.add(decoy5);
			frame.add(decoy6);
		}
		else {
			Reward.setText("");
			frame.getContentPane().setBackground(null);
		}*/
		
	}

}
