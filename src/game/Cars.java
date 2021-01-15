package game;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Cars {
	private int x = 100;
	private int y = -80;
	
	private int x3 = 440;
	private int y3 = -520;
	private Image image3;
	
	private int x4 = 100;
	private int y4 = -550;
	private Image image4;
	
	private int x5 = 300;
	private int y5 = -300;
	private Image image5;
	
	private int x6 = 420;
	private int y6 = -200;
	private Image image6;
	
	private Image image1;
	private Image image2;
	private int w;
	private int h;
	private int dx;
	private int dy;
	private int x2 = 220;
	private int y2 = -150;
	
	private int gecenSure = 0;
	
	
	public int getGecenSure() {
		return gecenSure;
	}

	public Cars() {

		initCars();

	}

	private void initCars() {
		ImageIcon i1 = new ImageIcon("C:\\car\\beyaz.png");
		image1 = i1.getImage();
		
		ImageIcon i2 = new ImageIcon("C:\\car\\kırmızı.png");
		image2 = i2.getImage();
		
		ImageIcon i3 = new ImageIcon("C:\\car\\bugatti.png");
		image3 = i3.getImage();
		
		ImageIcon i4 = new ImageIcon("C:\\car\\mor.png");
		image4 = i4.getImage();
		
		ImageIcon i5 = new ImageIcon("C:\\car\\mor2.png");
		image5 = i5.getImage();
		
		ImageIcon i6 = new ImageIcon("C:\\car\\yesil.png");
		image6 = i6.getImage();
		

		w = image1.getWidth(null);
		h = image1.getHeight(null);
	}
	
	public void move() { 
		gecenSure += 20;
		
		if(gecenSure>50000) {
			y2 = y2 + 7;
			if(y2> 600) {
				y2 = -50;
			}
			y = y + 7;
			if(y>600) {
				y = -150;
			}
			y3 = y3 + 7;
			if(y3 > 600) {
				y3 = -450;
			}
			y4 = y4 + 7;
			if(y4>600) {
				y4 =-550;
			}
			y5 = y5 + 7;
			if(y5 > 600) {
				y5 = -400;
			}
			y6 = y6 + 7;
			if(y6>600) {
				y6 = -200;
			}
		
		}if(gecenSure<50000) {
			y2 = y2 + 5;
			if(y2> 600) {
				y2 = -50;
			}
			y = y + 5;
			if(y>600) {
				y = -150;
			}
			y3 = y3 + 5;
			if(y3 > 600) {
				y3 = -550;
			}
			y4 = y4 + 5;
			if(y4>600) {
				y4 =-550;
			}
			y5 = y5 + 5;
			if(y5 > 600) {
				y5 = -400;
			}
			y6 = y6 + 5;
			if(y6>600) {
				y6 = -200;
			}

		}
		
				
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImage() {
		return image1;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	public int getDx() {
		return dx;
	}

	public int getDy() {
		return dy;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public Image getImage2() {
		return image2;
	}

	public int getX3() {
		return x3;
	}

	public int getY3() {
		return y3;
	}

	public Image getImage3() {
		return image3;
	}

	public int getX4() {
		return x4;
	}

	public int getY4() {
		return y4;
	}

	public Image getImage4() {
		return image4;
	}

	public int getX5() {
		return x5;
	}

	public int getY5() {
		return y5;
	}

	public Image getImage5() {
		return image5;
	}

	public int getX6() {
		return x6;
	}

	public int getY6() {
		return y6;
	}

	public Image getImage6() {
		return image6;
	}
	
	

}
