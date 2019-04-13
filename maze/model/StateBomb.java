package maze.model;

import maze.view.Maze;

public interface StateBomb {
	 public void doActionBomb(Armour bomb,Maze m);
	 public void doActionScary(Armour bomb,Maze m);
}
