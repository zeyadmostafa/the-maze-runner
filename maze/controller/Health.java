package maze.controller;

import maze.view.Board;
import maze.view.SingletonObject;

public class Health {
	private int theHealth;
	public static int health;
	//private Board b = SingletonObject.getBoard();
	public Health()
	{
		theHealth = health = 100;
	}
	public int gethealth()
	{
		return theHealth;
	}
	public void setHealth(String name)
	{
		if(name.equals("bomb"))
		this.theHealth= this.theHealth - 10;
		else if(name.equals("scary"))
		this.theHealth= this.theHealth-25;
	}
	public int increasehealth()
	{
		if(theHealth < 100 && theHealth >= 90)
		{
			theHealth = 100;
		}
		else if(theHealth < 90)
		{
			theHealth += 10;
		}
		return theHealth ;
	}
}
