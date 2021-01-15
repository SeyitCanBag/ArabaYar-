package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

	private Timer timer;	
	private RoadLines yol1, yol2, yol3,yol4,yol5,yol6;
	private MyCar araba;
	private Cars car;
	private final int DELAY = 10;
	private int score = 0;

	

	public Board() {

		initBoard();
	}

	private void initBoard() {
		
		yol1 = new RoadLines();
		yol2 = new RoadLines();
		yol3 = new RoadLines();
		yol4 = new RoadLines();
		yol5 = new RoadLines();
		yol6 = new RoadLines();

		setBackground(Color.darkGray);
		addKeyListener(new TAdapter());
		setFocusable(true);
		
		araba = new MyCar();
		car = new Cars();
		
		timer = new Timer(DELAY, this);
		timer.start();
		
	}

	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		score += car.getGecenSure();
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
	}
	
	public boolean kontrolEt() {
		if(new Rectangle(car.getX(),car.getY(),40,90).intersects(new Rectangle(araba.getX(),araba.getY(),40,100)) 
				|| new Rectangle(car.getX2(),car.getY2(),40,80).intersects(new Rectangle(araba.getX(),araba.getY(),40,90))
				|| new Rectangle(car.getX3(),car.getY3(),40,90).intersects(new Rectangle(araba.getX(),araba.getY(),40,100))
				|| new Rectangle(car.getX4(),car.getY4(),40,90).intersects(new Rectangle(araba.getX(),araba.getY(),40,100))
				|| new Rectangle(car.getX5(),car.getY5(),40,90).intersects(new Rectangle(araba.getX(),araba.getY(),40,100))
				|| new Rectangle(car.getX6(),car.getY6(),40,80).intersects(new Rectangle(araba.getX(),araba.getY(),15,100))
				|| new Rectangle(0,0,62,600).intersects(new Rectangle(araba.getX(),araba.getY(),20,100))
				|| new Rectangle(530,0,70,600).intersects(new Rectangle(araba.getX(),araba.getY(),43,100))){
			return true;
		}
		return false;
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.green);
		g2d.fillRect(0, 0, 70, 600);
		g2d.fillRect(530, 0, 70, 600);
		
		g2d.drawImage(yol1.getImage(), yol1.getX1(), yol1.getY1(), this);
		g2d.drawImage(yol2.getImage(), yol2.getX2(), yol2.getY2(), this);
		g2d.drawImage(yol3.getImage(), yol3.getX3(), yol3.getY3(), this);
		g2d.drawImage(yol4.getImage(), yol4.getX4(), yol4.getY4(), this);
		g2d.drawImage(yol5.getImage(), yol5.getX5(), yol5.getY5(), this);
		g2d.drawImage(yol6.getImage(), yol6.getX6(), yol6.getY6(), this);

		g2d.drawImage(araba.getImage(), araba.getX(), araba.getY(), this);
		g2d.drawImage(car.getImage(), car.getX(), car.getY(), this);
		g2d.drawImage(car.getImage2(), car.getX2(), car.getY2(), this);
		g2d.drawImage(car.getImage3(), car.getX3(), car.getY3(), this);
		g2d.drawImage(car.getImage4(), car.getX4(), car.getY4(), this);
		g2d.drawImage(car.getImage5(), car.getX5(), car.getY5(), this);
		g2d.drawImage(car.getImage6(), car.getX6(), car.getY6(), this);
		
		if(kontrolEt()) {
			timer.stop();
			String message = "Oyun Bitti...\n"
					+ "Geçen Süre : " + car.getGecenSure()/1000.0
					+ "\nSkor : " + score/10000;
			JOptionPane.showMessageDialog(this, message);
			System.exit(0);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		step();
	}

	private void step() {

		yol1.move();
		yol2.move();
		yol3.move();
		yol4.move();
		yol5.move();
		yol6.move();	
		araba.move();
		car.move();
		
		repaint();
	}

	private class TAdapter extends KeyAdapter {
												
		@Override
		public void keyReleased(KeyEvent e) {
			araba.keyReleased(e);
		}

		@Override
		public void keyPressed(KeyEvent e) {
			araba.keyPressed(e);
		}
	}
	
}