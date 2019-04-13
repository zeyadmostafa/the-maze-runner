package maze.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Armour implements Gift  {
	
	private int tileX, tileY ;
	private Image armour;
	public int armourNum;
	
	public Armour()
	{
		ImageIcon img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//armour.gif");
		armour = img.getImage();	
		tileX = 3;
		tileY = 5; // starting tiles
		armourNum=2;
	}
	@Override
	public int gettileX()
	{
		return tileX;
	}
	@Override
	public int gettileY()
	{
		return tileY;
	}
	@Override
	
	public Image getgift()
	{
		return armour;
	}
	
	@Override
	public int gettileX1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int gettileX2() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int gettileX3() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int gettileY1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int gettileY2() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int gettileY3() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int gettileX4() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int gettileY4() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
