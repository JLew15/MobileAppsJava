package chapter13;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ch13 implements ActionListener {

	JFrame frame;
	JTextField firstName;
	JTextField lastName;
	JButton myButton;
	JTextArea description;
	JSpinner ageSpinner;
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
		
		myButton = new JButton("Message Dialogs");
		myButton.addActionListener(this);
		
		contentPane.add(new JLabel("First Name"));
		contentPane.add(firstName);
		contentPane.add(new JLabel("Last Name"));
		contentPane.add(lastName);
		contentPane.add(new JLabel("Description"));
		contentPane.add(scrollBar);
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
		}
		else {
			JOptionPane messagebox = new JOptionPane();
			String title = messagebox.showInputDialog(frame,"Enter your favorite color","Your color", JOptionPane.WARNING_MESSAGE);
			String result = messagebox.showInputDialog(frame,"Enter your favorite color",title,JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(frame,"You like the color "+ result);
		}
		
	}
	
	

}
