package phoneDialer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PhoneDialer implements ActionListener{
	
	JFrame myFrame = null;
	JButton oneButton = null;
	JButton twoButton = null;
	JButton threeButton = null;
	JButton fourButton = null;
	JButton fiveButton = null;
	JButton sixButton = null;
	JButton sevenButton = null;
	JButton eightButton = null;
	JButton nineButton = null;
	JButton zeroButton = null;
	JButton dashButton = null;
	JButton dialButton = null;
	JLabel descriptionLabel = new JLabel("Enter the number to dial: ");
	
	
	
	
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
		if (control == oneButton) {
			userNumber = userNumber + "1";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == twoButton) {
			userNumber = userNumber + "2";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == threeButton) {
			userNumber = userNumber + "3";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == fourButton) {
			userNumber = userNumber + "4";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == fiveButton) {
			userNumber = userNumber + "5";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == sixButton) {
			userNumber = userNumber + "6";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == sevenButton) {
			userNumber = userNumber + "7";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == eightButton) {
			userNumber = userNumber + "8";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == nineButton) {
			userNumber = userNumber + "9";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == zeroButton) {
			userNumber = userNumber + "0";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == dashButton) {
			userNumber = userNumber + "-";
			descriptionLabel.setText("Enter the number to dial: " + userNumber);
		}
		else if (control == dialButton) {
			if (userNumber.equals("6666666666") || userNumber.equals("666-666-6666")) {
				JOptionPane.showMessageDialog(null, userNumber + " :rebmuN gnilaiD");
				myFrame.getContentPane().setBackground(Color.RED);
				userNumber = "";
				descriptionLabel.setText("Enter the number to dial: " + userNumber);
			}
			else {
				myFrame.getContentPane().setBackground(null);
				JOptionPane.showMessageDialog(null, "Dialing Number: " + userNumber);
				userNumber = "";
				descriptionLabel.setText("Enter the number to dial: " + userNumber);
			}
		}
	}
	
	String userNumber = "";

	public PhoneDialer() {
		myFrame = new JFrame();
		
		JPanel labelPane = new JPanel();
		labelPane.setLayout(new FlowLayout());
		
		JPanel numberPane = new JPanel();
		numberPane.setLayout(new GridLayout(4,3,5,5));
		Border numberBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		numberPane.setBorder(numberBorder);
		
		JPanel contentPane = (JPanel)myFrame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
		Border contentBorder = BorderFactory.createEmptyBorder(10,10,10,10);
		contentPane.setBorder(contentBorder);
		
		contentPane.add(labelPane);
		contentPane.add(numberPane);
		
		myFrame.setTitle("Dialer");
		myFrame.setSize(400,550);
		myFrame.setLocation(200,300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		oneButton = new JButton("1");
		twoButton = new JButton("2");
		threeButton = new JButton("3");
		fourButton = new JButton("4");
		fiveButton = new JButton("5");
		sixButton = new JButton("6");
		sevenButton = new JButton("7");
		eightButton = new JButton("8");
		nineButton = new JButton("9");
		zeroButton = new JButton("0");
		dashButton = new JButton("-");
		dialButton = new JButton("Dial Number");
		
		dialButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
		dashButton.addActionListener(this);
		dialButton.addActionListener(this);
		
		labelPane.add(descriptionLabel);
		numberPane.add(oneButton);
		numberPane.add(twoButton);
		numberPane.add(threeButton);
		numberPane.add(fourButton);
		numberPane.add(fiveButton);
		numberPane.add(sixButton);
		numberPane.add(sevenButton);
		numberPane.add(eightButton);
		numberPane.add(nineButton);
		numberPane.add(dashButton);
		numberPane.add(zeroButton);
		contentPane.add(dialButton);
	}

	public static void main(String[] args) {
		new PhoneDialer();
	}

}
