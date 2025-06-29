package com.mojang.Escape2;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import com.mojang.Escape2.gui.Screen;

public class Escape2Component extends Canvas implements Runnable{
	private static final int WIDTH = 160;
	private static final int HEIGHT = 120;
	private static final int SCALE = 4;
	
	public BufferedImage img;
	public int[] pixels;
	
	public boolean running;
	public Thread thread;
	public Screen screen;
	
	
	
	public Escape2Component(){
		
		Dimension size = new Dimension(WIDTH*SCALE, HEIGHT*SCALE);
		setPreferredSize(size);
		screen = new Screen(WIDTH,HEIGHT);
		img = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
		
	}
	
	
	public void start() {
		if(running)return;
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	public void run() {
		
		while(running) {
			
			render();
		}
		
		
	}
	
	public void render() {
		
		BufferStrategy bs = getBufferStrategy();
		
		if(bs==null) {
			createBufferStrategy(3);
			return;
		}
		
		screen.render();
		
		for(int i=0; i < WIDTH * HEIGHT; i++) {
			
			
		
			pixels[i] = screen.pixels[i];
			
		}
		
		Graphics g = bs.getDrawGraphics();
		g.drawImage(img, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
		bs.show();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Escape2Component game = new Escape2Component();
		
		JFrame frame = new JFrame("Escape...");
		
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		game.start(); //game started
		
		
	}
	
	
}