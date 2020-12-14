package buttonExperiments;
import javax.swing.*;
import java.awt.*;

public class ButtonExperiments {
	JFrame myFrame;
	JPanel contentPane;
	public ButtonExperiments() {
		myFrame = new JFrame();
		contentPane = new JPanel();
		myFrame.setContentPane(contentPane);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("buttons");
		myFrame.setSize(300,200);
		myFrame.setLocation(100,200);
		
		GridLayout grid = new GridLayout(2,2);
		BorderLayout border = new BorderLayout();
		contentPane.setLayout(grid);

		JPanel tLPane = new JPanel();
		tLPane.setLayout(grid);
		JPanel tRPane = new JPanel();
		tRPane.setLayout(border);
		JPanel bLPane = new JPanel();
		FlowLayout flow = new FlowLayout();
		bLPane.setLayout(flow);
		JPanel bRPane = new JPanel();
		BoxLayout box1 = new BoxLayout(bRPane,BoxLayout.Y_AXIS);
		bRPane.setLayout(box1);
		
		contentPane.add(tLPane);
		contentPane.add(tRPane);
		contentPane.add(bLPane);
		contentPane.add(bRPane);
		myFrame.setVisible(true);
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		
		JButton button5 = new JButton("1");
		JButton button6 = new JButton("2");
		JButton button7 = new JButton("3");
		JButton button8 = new JButton("4");
		
		JButton button9 = new JButton("1");
		JButton button10 = new JButton("2");
		JButton button11 = new JButton("3");
		JButton button12 = new JButton("4");
		
		JButton button13 = new JButton("1");
		JButton button14 = new JButton("2");
		JButton button15 = new JButton("3");
		JButton button16 = new JButton("4");
		
		tLPane.add(button1);
		tLPane.add(button2);
		tLPane.add(button3);
		tLPane.add(button4);
		
		tRPane.add(button5,BorderLayout.PAGE_START);
		tRPane.add(button6,BorderLayout.PAGE_END);
		tRPane.add(button7,BorderLayout.CENTER);
		tRPane.add(button8,BorderLayout.LINE_END);
		
		bLPane.add(button9);
		bLPane.add(button10);
		bLPane.add(button11);
		bLPane.add(button12);
		
		button13.setAlignmentY(Component.CENTER_ALIGNMENT);
		bRPane.add(button13);
		button14.setAlignmentY(Component.CENTER_ALIGNMENT);
		bRPane.add(button14);
		button15.setAlignmentY(Component.CENTER_ALIGNMENT);
		bRPane.add(button15);
		button16.setAlignmentY(Component.CENTER_ALIGNMENT);
		bRPane.add(button16);
	}

	public static void main(String[] args) {
		new ButtonExperiments();

	}

}
