package game;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class RoadLines {
	private int x1 = 200;
	private int y1 = -25;
	private int x2 = 200;
	private int y2 = 200;
	private int x3 = 200;
	private int y3 = 400;
	private int x4 = 400;
	private int y4 = -25;
	private int x5 = 400;
	private int y5 = 200;
	private int x6 = 400;
	private int y6 = 400;

	private int w;
	private int h;

	private int dx;
	private int dy;
	private Image image;

	public RoadLines() {

		loadImage();

	}

	private void loadImage() {
		ImageIcon ii = new ImageIcon("C:\\araba\\yol1.png");
		image = ii.getImage();

		w = image.getWidth(null);
		h = image.getHeight(null);

	}

	public void move() {

		y1 += 5;
		y2 += 5;
		y3 += 5;
		y4 += 5;
		y5 += 5;
		y6 += 5;

		if (y1 > 600) {
			y1 = -70;
		}
		if (y2 > 600) {
			y2 = -70;
		}
		if (y3 > 600) {
			y3 = -70;
		}
		if (y4 > 600) {
			y4 = -70;
		}
		if (y5 > 600) {
			y5 = -70;
		}
		if (y6 > 600) {
			y6 = -70;
		}
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	public int getY1() {
		return y1;
	}

	public int getX1() {
		return x1;
	}

	public int getDy() {
		return dy;
	}

	public Image getImage() {
		return image;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public int getX3() {
		return x3;
	}

	public int getY3() {
		return y3;
	}

	public int getX4() {
		return x4;
	}

	public int getY4() {
		return y4;
	}

	public int getX5() {
		return x5;
	}

	public int getY5() {
		return y5;
	}

	public int getX6() {
		return x6;
	}

	public int getY6() {
		return y6;
	}

}
