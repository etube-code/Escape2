package com.mojang.Escape2;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Escape2Component extends JComponent{
	
	private static final int WIDTH = 160;
	private static final int HEIGHT = 120;
	private static final int SCALE = 4;
	
	

	
	
public Escape2Component() {
	
	Dimension size = new Dimension(WIDTH*SCALE, HEIGHT*SCALE);
	setPreferredSize(size);
	
	
}





public static void main(String[] args) {
	
	JFrame frame = new JFrame("Escape..");
	
	Escape2Component game = new Escape2Component();
	
	
	frame.add(game);
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
}

}

