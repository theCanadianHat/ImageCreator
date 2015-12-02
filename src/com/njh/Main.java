package com.njh;

public class Main {
	
	static int COL = 10;
	static int ROW = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PixMap pm = new PixMap(COL, ROW);
		
		for(int col = 0; col < COL; col++){
			for(int row = 0; row < ROW; row++){
				pm.setPixel(col, row, new Pixel(65,65,65));
			}
		}
		
		FileManager.createAndSaveImage(pm, COL, ROW, 4);
	}

}
