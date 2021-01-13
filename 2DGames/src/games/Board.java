package games;

import java.awt.BasicStroke;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Board extends JPanel implements ActionListener{
	Image img;
	String[] location = {"src/res/img/gastertime.png","src/res/img/reee.png"};
	
	public void initBoard(int i) {
		loadImage(i);
		int w = img.getWidth(this);
		int h = img.getHeight(this);
		setPreferredSize(new Dimension(w,h));
		
	}
	
	private void loadImage(int i) {
		ImageIcon imgi = new ImageIcon(location[i]);
		img = imgi.getImage();
	}
	
	private void drawShape(Graphics g) {
		Graphics2D g2D = (Graphics2D)g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2D.setRenderingHints(rh);
		
		Dimension size = getSize();
		double w = size.getWidth();
		double h = size.getHeight();
		
		Ellipse2D e = new Ellipse2D.Double(0,0,80,130);
		g2D.setStroke(new BasicStroke(1));
		g2D.setColor(Color.RED);
		
		for(double d = 0; d < 360; d+=1) {
			AffineTransform at = AffineTransform.getTranslateInstance(w/2,h/2);
			at.rotate(Math.toRadians(d));
			g2D.draw(at.createTransformedShape(e));
		}
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//drawShape(g);
		g.drawImage(img,0,0,null);
	}

	public Board() {
		
	
		
	}
	public void reDraw(int i, Graphics g) {
		loadImage(i);
		g.drawImage(img,0,0,null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		
	}

}
