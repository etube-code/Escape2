package com.mojang.Escape2.gui;



public class Bitmap{
	
	public final int width;
	public final int height;
	public final int[] pixels;
	
	
	public Bitmap(int width, int height) {
		
		this.width = width;
		this.height = height;
		pixels = new int[width*height];
			
	}
	
	
	public void draw(Bitmap bitmap,int xOffs,int yOffs) {
		
		for (int y=0; y<bitmap.height; y++) {
			
		  int yPix = y + yOffs;
		  if(y<0 || y>=bitmap.height) continue;
		  
			for (int x=0; x<bitmap.height; x++) {
				
				  int xPix = y + xOffs;
				  if(x<0 || x>=bitmap.height) continue;
				  
				  pixels[xPix + yPix * width] = bitmap.pixels[x + y * width];
			
			}
		}
	
	}		
		
}		

	
	
	
	
	
	
	
	
	
