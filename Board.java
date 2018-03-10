import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	private Timer timer;
	private Player player;
	private Spider spiders[] = new Spider[MAX_SPIDERS];
		
	private void loadSpider() {
		int x = GWIDTH/2-100;
		int speed = 2;
		 for(int i =0;i<spiders.length; i++) {
		spiders[i] = new Spider(x, speed);
		  x = x+200;
		  speed = speed +3;
		 }
	}
	
	private void drawSpiders(Graphics g) {
		for(Spider spider : spiders) {
			spider.drawSpider(g);
		}
	}
	
	private boolean isCollide(Player player, Spider spider) {
		int maxWidth = Math.max(player.w, spider.w);
		int maxHeight = Math.max(player.h, spider.h);
		int xDistance = Math.abs(player.x-spider.x);
		int yDistance = Math.abs(player.y - spider.y);
		return xDistance<= maxWidth-50 && yDistance<=maxHeight-50;
	}
		
	
	private void checkCollision(Graphics g) {
		for(Spider spider : spiders) {
			if(isCollide(player, spider)) {
				gameOver(g);
				return;
			}
		}
	}
	
	private void gameOver(Graphics g) {
		g.setColor(Color.RED);
		g.setFont(new Font("Arial", Font.BOLD,32 ));;
		g.drawString("GAME OVER", GWIDTH/2, GHEIGHT/2);
		timer.stop();
	}
	
	public Board() {
		setSize(GWIDTH, GHEIGHT);
		player = new Player();
		gameLoop();
		setFocusable(true);
		bindEvents();
		loadSpider();
		
	}
	
	private void drawBackground(Graphics g) {
		Image bg = new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE)).getImage();
		g.drawImage(bg, 0, 0, GWIDTH, GHEIGHT, null);
	}
	
	private void gameLoop() {
		ActionListener r = (e) ->{
			repaint();
			player.fall();
		};
		
		timer = new Timer(DELAY, r);
		timer.start();
  }
	
	private void bindEvents() {
		this.addKeyListener(new KeyAdapter() { 
	
			public void keyReleased(KeyEvent e) {
				player.setSpeed(0);
			}
			
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_LEFT) {
					player.setSpeed(-5);
					
				}
				else
				if(keyCode == KeyEvent.VK_RIGHT) {
					player.setSpeed(5);
				}
				
				else
				if(keyCode == KeyEvent.VK_UP) {
					player.jump();
					
				}
				
				else
			    if(keyCode == KeyEvent.VK_DOWN) {
			    	
			    }
				System.out.println("Key Pressed " +e.getKeyChar()+ " "+e.getKeyChar());
			}
		});
	}
	
	@Override
	public void paintComponent(Graphics g) {
		drawBackground(g);
		player.drawPlayer(g);
		drawSpiders(g);
		checkCollision(g);
	}

}


