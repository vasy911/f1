package F1;


import java.awt.Image;
 


import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player {
	
	public static final int MAX_V = 80;
	public static final int MAX_TOP = 470;
	public static final int MAX_BOTTOM = 720;  
	
	
    Image img = new ImageIcon("res/rival.png").getImage();
	
    public Rectangle getRect(){
		return new Rectangle(x, y,150, 63);
	}
    
    
    
	int v = 0;
	int dv = 0;
	int s = 0;
	
	int x = 30;
	int y = 500;
	int dy = 0;
	
	
	
	
	int layer1 = 0;
	int layer2 = 1200;
	
	public void move() {
		
		s += v;
		v += dv;
		if (v <= 0) v = 0;
		if (v >= MAX_V) v = MAX_V;
		y -= dy;
		if (y <= MAX_TOP) y = MAX_TOP;
		if (y >= MAX_BOTTOM)y =MAX_BOTTOM;
		if (layer2 - v <= 0){
			layer1 = 0;
			layer2 = 1200;
		} else {
			
		
		layer1 -= v;
		layer2  -= v;
		
	}

}
public void  keyPressed(KeyEvent e){
  int key = e.getKeyCode();
  if (key == KeyEvent.VK_RIGHT){
	  dv = 5;
  }
  if (key == KeyEvent.VK_LEFT){
	  dv = -5;
  }
  
  if (key == KeyEvent.VK_UP){
	  dy = 15;
	  
 } 
  if (key == KeyEvent.VK_DOWN){
	  dy = -15;
	  
 } 
  
 }

  public void keyReleased(KeyEvent e){
	int key = e.getKeyCode();
	if (key == KeyEvent.VK_RIGHT ||key == KeyEvent.VK_LEFT){
		  dv = 0;
	  }
	 if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN){
		  dy = 0;
		  
	 } 
}

}

