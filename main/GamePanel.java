import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private ArrayList<Color> colorHistory;
	private Color currentColor;
	private Random rng = new Random();
	private static final long serialVersionUID = 1L;
	public GamePanel() {
		colorHistory = new ArrayList<Color>();
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				if (keycode == KeyEvent.VK_Q) {
					if (currentColor != null) {
						colorHistory.add(currentColor);
					}
					Color randomColor = new Color(rng.nextInt(255), rng.nextInt(255), rng.nextInt(255));
					currentColor = randomColor;
					setBackground(randomColor);
				} else if (keycode == KeyEvent.VK_G) {
					if (colorHistory.size() > 0) {
						Color pastColor = colorHistory.get(colorHistory.size() - 1);
						setBackground(pastColor);
						colorHistory.remove(colorHistory.size() - 1);
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Press Q To Generate A Random Color!", 125, 200);
		g.drawString("Press G To Go Back To Past Color!", 125, 250);
	}
	
}
