package maze.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ScaryBomb implements Bomb{
	

	

		private int tileX, tileY ;
		private int tileX1, tileY1 ;
		private int tileX2, tileY2 ;
		private int tileX3, tileY3 ;
		private int tileX4, tileY4 ;


		private Image bomb;
		

		public ScaryBomb()
		{
			ImageIcon img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//scarybomb.png");
			bomb = img.getImage();
			tileX = 28;
			tileY = 15; 
			
			tileX1 = 18;
			tileY1 = 5; 
			
			tileX2 = 7;
			tileY2 = 16; 
			
			tileX3 = 6;
			tileY3 = 9; 
			
			tileX4 = 15;
			tileY4 = 8; 
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
	public int gettileY4()
	{
		return tileY4;
	}
	@Override
		
		public Image getbomb()
		{
			return bomb;
		}

	@Override
	public int gettileX5() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileX6() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileX7() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileX8() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileX9() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileY5() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileY6() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileY7() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileY8() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int gettileY9() {
		// TODO Auto-generated method stub
		return 0;
	}
	}



