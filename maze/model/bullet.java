package maze.model;

import java.awt.Graphics;

public class bullet {
	private double x;
	private double y;
	Sprites s;
	public static int numberOfBullets;
	
	public bullet()
	{
		numberOfBullets = 6;
		Sprites s = new Sprites();
		this.x=x;
		this.y=y;
	}
	public void tick()
	{
		y-=10;
	}
	public void draw(Graphics g)
	{
		g.drawImage(s.getfire(), (int)x,(int) y, null);
	}

}
