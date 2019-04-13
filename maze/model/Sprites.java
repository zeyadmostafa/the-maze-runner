package maze.model;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;

public class Sprites {
	
	private Scanner m;
	private String map[] = new String[100];
	private Image floor;
	private Image wall;
    private Image bushes;
    private Image fire;
	private Image finish;
	private Image bulletgift;

	public Sprites()
	{
		ImageIcon img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//floor.jpg");
		floor = img.getImage();
		img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//wall.png");
		wall = img.getImage();
		img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//bushes.png");
		bushes = img.getImage();
		img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//fire.png");
		fire = img.getImage();
		img = new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//finish.png");
		finish = img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getfloor()
	{
		return floor ;
	}
	public Image getfinish()
	{
		return finish ;
	}
	public Image getfire()
	{
		return fire ;
	}
	
	public Image getwall()
	{
		return wall ;
	}
	
	public Image getbushes()
	{
		return bushes ;
	}

	public String getMap(int x, int y)
	{
		String index = map[y].substring(x, x+1);
		return index;
	}
	
	public void openFile() {
		// TODO Auto-generated method stub
		try {
			m = new Scanner(new File("F://InvisibleNinjas-themaze-789cd767333a//src//maze//Maps.txt"));
		}
		catch(Exception e)
		{
			System.out.println("Error loading Sprite");
		}
	}

	public void readFile() {
		// TODO Auto-generated method stub
		while(m.hasNext())
		{
			for(int i=0; i<20; i++)
			{
			  map[i] = m.next();	
			}
		}
		
	}

	public void closeFile() {
		// TODO Auto-generated method stub
		 m.close();	
	}

}
