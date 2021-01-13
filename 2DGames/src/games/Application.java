package games;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame{
	int height = 200;
	int width = 250;
	String title = "Title";

	public Application() {
		initUI();
	}
	
	private void initUI() {
		add(new Board());
		
		setSize(width,height);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			Application ex = new Application();
			ex.setVisible(true);
		});

	}

}
