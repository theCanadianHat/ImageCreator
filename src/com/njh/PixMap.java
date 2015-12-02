package com.njh;

public class PixMap {
	private Pixel[][] map;
	
	public PixMap(int coloumns, int rows){
		this.map = new Pixel[coloumns][rows];
	}
	
	private PixMap(){};
	
	public Pixel[][] getMap(){
		return this.map;
	}
	
	public void setPixel(int coloumn, int row, Pixel pixel){
		this.map[coloumn][row] = pixel;
	}
	
	public Pixel getPixel(int coloumn, int row){
		return this.map[coloumn][row];
	}
}
