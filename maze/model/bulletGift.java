package maze.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class bulletGift {

	private int tileX, tileY ;
	private int tileX1, tileY1 ;
	private int tileX2, tileY2 ;
	private int tileX3, tileY3 ;

	private Image bulletgift;
	

	public bulletGift()
	{
		ImageIcon img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//gun.png");
		bulletgift = img.getImage();
		tileX = 9;
		tileY = 1; 
		
		tileX1 = 8;
		tileY1 = 9; 
		
	}
	

	
	public int gettileX()
	{
		return tileX;
	}
	public int gettileX1()
	{
		return tileX1;
	}
	public int gettileX2()
	{
		return tileX2;
	}
	public int gettileX3()
	{
		return tileX3;
	}
	
	public int gettileY()
	{
		return tileY;
	}
	public int gettileY1()
	{
		return tileY1;
	}
	public int gettileY2()
	{
		return tileY2;
	}
	public int gettileY3()
	{
		return tileY3;
	}
	
	public Image getbullet()
	{
		return bulletgift ;
	}
}
