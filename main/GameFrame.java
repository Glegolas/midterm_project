package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	public GameFrame() {
		Dimension size = new Dimension(500, 500);
		setTitle("Liam Meehan - Midterm Project");
		setSize(size);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GamePanel panel = new GamePanel();
		panel.setFocusable(true);
		panel.requestFocus();
		add(panel);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	
}
