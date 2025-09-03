package com.mojang.Escape2;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Escape2Component extends Canvas implements Runnable{
	
	private boolean running;
	private Thread thread;
	
	private static final int WIDTH = 160;
	private static final int HEIGHT = 120;
	private static final int SCALE = 4;
	
	
	public Escape2Component() {
		
		Dimension size = new Dimension(WIDTH*SCALE,HEIGHT*SCALE);
		setPreferredSize(size);
		
		
		
	}
	
	public void start() {
		
		if(running)return;
			running = true;
			thread = new Thread(this);
			thread.start();
				
	}
	
	public void run() {
		
		
		
	}
	
	
	public void render() {
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Escape2Component game = new Escape2Component();
		
		JFrame frame = new JFrame("Escape2..");
		
		frame.add(game);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}