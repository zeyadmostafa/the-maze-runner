package maze.model;

public class FactoryDesign {
	
	public Gift getGift(String Gift)
	{
		if(Gift.equalsIgnoreCase("GIFTS"))
		{
			return new Gifts();
		}
		if (Gift.equalsIgnoreCase("ARMOUR") )
		{
			return new Armour();
		}
		return null;
	}

}
