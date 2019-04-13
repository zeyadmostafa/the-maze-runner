package maze.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bombs implements Bomb {

	private int tileX, tileY ;
	private int tileX1, tileY1 ;
	private int tileX2, tileY2 ;
	private int tileX3, tileY3 ;
	private int tileX4, tileY4 ;
	private int tileX5, tileY5 ;
	private int tileX6, tileY6 ;
	private int tileX7, tileY7 ;
	private int tileX8, tileY8 ;
	private int tileX9, tileY9 ;

	private Image bomb;
	

	public Bombs()
	{
		ImageIcon img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//bomb.png");
		bomb = img.getImage();
		tileX = 5;
		tileY = 1; 
		
		tileX1 = 5;
		tileY1 = 5; 
		
		tileX2 = 13;
		tileY2 = 9; 
		
		tileX3 = 1;
		tileY3 = 6; 
		
		tileX4 = 15;
		tileY4 = 1; 
		
		tileX5 = 28;
		tileY5 = 7; 
		
		tileX6 = 5;
		tileY6 = 13; 
		
		tileX7 = 17;
		tileY7 = 13; 
		
		tileX8 = 21;
		tileY8 = 11; 
		
		tileX9 = 14;
		tileY9 = 16; 
	}
	
@Override
	
	public int gettileX()
	{
		return tileX;
	}
@Override
	public int gettileX1()
	{
		return tileX1;
	}
@Override
	public int gettileX2()
	{
		return tileX2;
	}
@Override
	public int gettileX3()
	{
		return tileX3;
	}
@Override
	
	public int gettileY()
	{
		return tileY;
	}
@Override
	public int gettileY1()
	{
		return tileY1;
	}
@Override
	public int gettileY2()
	{
		return tileY2;
	}
@Override
	public int gettileY3()
	{
		return tileY3;
	}
@Override
	
	public Image getbomb()
	{
		return bomb;
	}

@Override
public int gettileX4() {
	// TODO Auto-generated method stub
	return tileX4;
}

@Override
public int gettileY4() {
	// TODO Auto-generated method stub
	return tileY4;
}

@Override
public int gettileX5() {
	// TODO Auto-generated method stub
	return tileX5;
}

@Override
public int gettileX6() {
	// TODO Auto-generated method stub
	return tileX6;
}

@Override
public int gettileX7() {
	// TODO Auto-generated method stub
	return tileX7;
}

@Override
public int gettileX8() {
	// TODO Auto-generated method stub
	return tileX8;
}

@Override
public int gettileX9() {
	// TODO Auto-generated method stub
	return tileX9;
}

@Override
public int gettileY5() {
	// TODO Auto-generated method stub
	return tileY5;
}

@Override
public int gettileY6() {
	// TODO Auto-generated method stub
	return tileY6;
}

@Override
public int gettileY7() {
	// TODO Auto-generated method stub
	return tileY7;
}

@Override
public int gettileY8() {
	// TODO Auto-generated method stub
	return tileY8;
}

@Override
public int gettileY9() {
	// TODO Auto-generated method stub
	return tileY9;
}
}
