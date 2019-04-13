package maze.model;

import maze.view.Maze;

public class ActionDecreaseState implements StateBomb {

	@Override
	public void doActionBomb(Armour bomb,Maze m) {
		
		m.h.setHealth("bomb");
		
	}

	@Override
	public void doActionScary(Armour bomb,Maze m) {
		m.h.setHealth("scary");
	}

}
