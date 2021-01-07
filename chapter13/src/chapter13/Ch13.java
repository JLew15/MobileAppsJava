package chapter13;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ch13 implements ActionListener, MouseWheelListener {

	JFrame frame;
	JTextField firstName;
	JTextField lastName;
	JButton myButton;
	JTextArea description;
	JSpinner ageSpinner;
	Integer value;
	String[] gamesList = {"Bioshock",
			"Bioshock 2",
			"Bioshock Infinite",
			"Doki Doki Literature Club",
			"Undertale",
			"Terraria",
			"Call of Duty World at War",
			"Call of Duty Black Ops",
			"Call of Duty 4: Modern Warfare",
			"Call of Duty Modern Warfare 2",
			"Call of Duty Black Ops 2",
			"Call of Duty Black Ops 3",
			"Call of Duty Modern Warfare 3",
			"Call of Duty Infinite Warfare",
			"Call of Duty Advanced Warfare",
			"Call of Duty Modern Warfare",
			"Call of Duty Black Ops 4",
			"Call of Duty WWII",
			"Tom Clancy's Rainbow Six Siege",
			"Call of Duty Cold War",
			"For Honor",
			"Watch Dogs",
			"CS:GO",
			"Rocket League",
			"Call of Duty Ghosts"};
	JComboBox cBtestBox;
	public Ch13() throws IOException {
		frame = new JFrame();
		//FlowLayout flowlayout = new FlowLayout();
		JPanel contentPane = (JPanel)frame.getContentPane();
		BoxLayout box = new BoxLayout(contentPane,BoxLayout.Y_AXIS);
		
		frame.setLayout(box);
		frame.setTitle("Message dialog gui.");
		frame.setSize(500,500);
		frame.setLocation(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		firstName = new JTextField(20);
		lastName = new JTextField(20);
		
		description = new JTextArea(5,20);
		
		JScrollPane scrollBar = new JScrollPane(description,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		ageSpinner = new JSpinner(new SpinnerNumberModel(18,0,130,1));
		ageSpinner.addMouseWheelListener(this);
		
		
		JList favGamesJList = new JList(gamesList);
		JScrollPane gameScroll = new JScrollPane(favGamesJList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		favGamesJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		favGamesJList.setSelectedIndex(1);
		cBtestBox = new JComboBox(gamesList);
		cBtestBox.setEditable(true);
		cBtestBox.setSelectedIndex(3);
		
		myButton = new JButton("Message Dialogs");
		myButton.addActionListener(this);
		
		contentPane.add(new JLabel("First Name"));
		contentPane.add(firstName);
		contentPane.add(new JLabel("Last Name"));
		contentPane.add(lastName);
		contentPane.add(new JLabel("Description"));
		contentPane.add(scrollBar);
		contentPane.add(cBtestBox);
		contentPane.add(new JLabel("Enter your age."));
		contentPane.add(ageSpinner);
		contentPane.add(myButton);
		
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) throws IOException {
		new Ch13();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object control = e.getSource();
		if (control == myButton) {
			String fName = firstName.getText();
			String lName = lastName.getText();
			String destext = description.getText();
			JOptionPane.showMessageDialog(frame, "Hello "+fName+" "+lName+"\n"+destext);
			cBtestBox.addItem(fName);
			cBtestBox.addItem(lName);
		}
		else {
			JOptionPane messagebox = new JOptionPane();
			String title = messagebox.showInputDialog(frame,"Enter your favorite color","Your color", JOptionPane.WARNING_MESSAGE);
			String result = messagebox.showInputDialog(frame,"Enter your favorite color",title,JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(frame,"You like the color "+ result);
		}
		
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		value = (Integer)ageSpinner.getValue();
		if(value > 0 && value < 130) {
			ageSpinner.setValue((value).intValue() - e.getWheelRotation());
		}
		if (value <= 0) {
			ageSpinner.setValue(value += 1);
		}
		else if (value >= 130){
			ageSpinner.setValue(value -= 1);
		}
		
	}
	
	

}
