package maze.view;
import maze.controller.Health;
import maze.model.*;

public class SingletonObject {
	private static bullet bu = new bullet();
	private static Board board = new Board();
	private static Player p = new Player();
	private static Sprites s = new Sprites();
	private static Maze maze = new Maze();
	private static FactoryDesign factory = new FactoryDesign();
	private static Gift gift = factory.getGift("GIFTS");
	private static Gift armour = factory.getGift("ARMOUR");
//	private static Health health = new Health();
	private SingletonObject(){}
	
	public static bullet getBullet()
	{
		return bu;
	}
	public static Board getBoard()
	{
		return board;
	}
	public static Player getPlayer()
	{
		return p;
	}
	public static Gift getgift()
	{
		return gift;
	}
	public static Gift getarmour()
	{
		return armour;
	}
	public static Sprites getS()
	{
		return s;
	}
	public static Maze getmaze()
	{
		return maze;
	}
	
	public static FactoryDesign getFactory()
	{
		return factory;
	}
	
	

}
