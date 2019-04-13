package maze.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Gifts implements Gift {
	
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
	private int tileX10, tileY10 ;
	private int tileX11, tileY11 ;
	private int tileX12, tileY12 ;


	private Image gift;
	private Image health;


	public Gifts  ()
	{
		ImageIcon img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//coin.gif");
		gift = img.getImage();
		
		img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//health.gif");
		health = img.getImage();
		
		tileX = 13;
		tileY = 5; 
		
		tileX1 = 5;
		tileY1 = 7; 
		
		tileX2 = 1;
		tileY2 = 3; 
		
		tileX3 = 1;
		tileY3 = 11; 
			
		tileX4 = 1; //health
		tileY4 = 15; 
		
		tileX5 = 18;
		tileY5 = 1; 
		
		tileX6 = 6;
		tileY6 = 13; 
		
		tileX7 = 14;
		tileY7 = 13; 
			
		tileX8 = 19;
		tileY8 = 15; 
		
		tileX9 = 24;
		tileY9 = 5; 
		
		tileX10 = 24;
		tileY10 = 11; 
		
		tileX11 = 25;  
		tileY11 = 3; 
			
		tileX12 = 25;
		tileY12 = 14; 
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
    public int gettileX4()
    {
	return tileX4;
    }
    @Override
    public int gettileY4()
    {
	return tileY4;
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
	
	public Image getgift()
	{
		return gift;
	}
	public Image gethealth()
	{
		return health;
	}

	


	public int getTileX5() {
		return tileX5;
	}


	public int getTileX6() {
		return tileX6;
	}

	public int getTileX7() {
		return tileX7;
	}

	public int getTileY8() {
		return tileY8;
	}

	public int getTileX8() {
		return tileX8;
	}

	public int getTileX9() {
		return tileX9;
	}

	public int getTileX10() {
		return tileX10;
	}

	public int getTileY11() {
		return tileY11;
	}

	public int getTileY9() {
		return tileY9;
	}

	public int getTileY10() {
		return tileY10;
	}

	public int getTileX11() {
		return tileX11;
	}

	public int getTileY6() {
		return tileY6;
	}

	public int getTileY7() {
		return tileY7;
	}

	public int getTileY5() {
		return tileY5;
	}

	public int getTileX12() {
		return tileX12;
	}
	public int getTileY12() {
		return tileY12;
	}
}
