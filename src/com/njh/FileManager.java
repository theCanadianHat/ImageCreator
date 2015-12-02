package com.njh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {

	static final String PPM_HEADER = "P6\n";
	static final String MAX_COLOR_VALUE = "255\n";
		
	public static void createAndSaveImage(PixMap pixMap, int coloumns, int rows, int fileNumber){
		String fileName = Integer.toString(fileNumber)+".ppm";
		PrintWriter newFile = null;
		try{
			newFile = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			String ppmHeader = createPpmHeader(coloumns, rows, fileName);
			newFile.append(ppmHeader);
			
			for(int col = 0; col < coloumns; col++){
				for(int row = 0; row < rows; row++){
					newFile.print(pixMap.getPixel(col, row).toString());
					if(row == (rows - 1) && col != (coloumns - 1)){
						newFile.print("\n");
					}
				}
			}
			
		}catch(IOException ioe){
			System.err.println("There was an error witht the file.");
		}finally{
			newFile.close();
		}
	}
	
	public static String createPpmHeader(int coloumns, int rows, String fileName ){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(PPM_HEADER);
		stringBuilder.append("# "+fileName+"\n");
		stringBuilder.append(Integer.toString(coloumns)+" "+Integer.toString(rows)+"\n");
		stringBuilder.append(MAX_COLOR_VALUE);
		return stringBuilder.toString();
	}
}
