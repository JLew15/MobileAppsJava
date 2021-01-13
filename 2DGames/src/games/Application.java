package games;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Application extends JFrame implements ActionListener{
	int height = 200;
	int width = 250;
	String title = "Title";
	JButton button;
	int i = 0;
	Board board = new Board();

	public Application() {
		initUI();
	}
	
	private void initUI() {
		add(board);
		
		setSize(width,height);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		button = new JButton();
		button.addActionListener(this);
		add(button);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			Application ex = new Application();
			ex.setVisible(true);
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		i ++;
		board.initBoard(i);
		
	}

}
