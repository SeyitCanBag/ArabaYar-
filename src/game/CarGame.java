package game;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class CarGame extends JFrame {

    public CarGame() {
        
        initUI();
    }
    
    private void initUI() {

        add(new Board());

        setTitle("Araba Yarýþý");
        setSize(600, 600);
        
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	CarGame ex = new CarGame();
            ex.setVisible(true);
        });
    }
}