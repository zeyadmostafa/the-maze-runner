package maze.model;

import maze.view.Maze;

public class ActionPause implements StateTime{

	@Override
	public void doAction(Maze m) {
		m.s1.stop();
		m.m1.stop();
	}

}
