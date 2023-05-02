package Gam2048;

import javax.swing.JFrame;

public class Main {
        
	public static Game2048 t1=new Game2048();
	public static Music t2 = new Music();
	
    public void startG() {
        t1.start();
        t2.start();
    }
    
    public static void main(String[] args) {
        Main m=new Main();
        m.startG();
    }
}