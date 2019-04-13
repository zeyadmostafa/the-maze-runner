package maze.model;

import maze.view.Maze;

public class ActionNoState implements StateBomb{

	@Override
	public void doActionBomb(Armour bomb, Maze m) {
		bomb.armourNum--;
		
	}

	@Override
	public void doActionScary(Armour bomb, Maze m) {
		bomb.armourNum=bomb.armourNum-1;
	}

}
