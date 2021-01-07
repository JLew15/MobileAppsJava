package chapter13;
import javax.swing.*;
import java.awt.event.*;
public class TestSpinner extends JFrame implements MouseWheelListener {
	private JSpinner spinner;
	private Integer value;
	public TestSpinner() {
		setSize( 400, 400);
		spinner = new JSpinner(new SpinnerNumberModel(18,0,130,1));
		spinner.addMouseWheelListener(this);
		getContentPane().add(spinner, "Center");
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		value = (Integer)spinner.getValue();
		if(value > 0 && value < 130) {
			spinner.setValue((value).intValue() - e.getWheelRotation());
		}
		if (value <= 0) {
			spinner.setValue(value += 2);
		}
		else if (value >= 130){
			spinner.setValue(value -= 2);
		}
		
	}
	
	public static void main(String[] args) {
		TestSpinner t = new TestSpinner();
		t.setVisible(true);
	}

}
