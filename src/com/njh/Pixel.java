package com.njh;

public class Pixel {
	private char redValue;
	private char greenValue;
	private char blueValue;
	
	public Pixel(char redValue, char greenValue, char blueValue){
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	
	public Pixel(){
		this.redValue = 0;
		this.greenValue = 0;
		this.blueValue = 0;
	}
	
	public Pixel(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this((char)i,(char)j,(char)k);
	}

	public char getRedValue(){
		return this.redValue;
	}
	
	public void setRedValue(char redValue){
		this.redValue = redValue;
	}
	
	public char getGreenValue(){
		return this.greenValue;
	}
	
	public void setGreenValue(char greenValue){
		this.greenValue = greenValue;
	}
	
	public char getBlueValue(){
		return this.blueValue;
	}
	
	public void setBlueValue(char blueValue){
		this.blueValue = blueValue;
	}
	
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append(redValue)
					 .append(greenValue)
					 .append(blueValue)
					 .toString();
	}
}
