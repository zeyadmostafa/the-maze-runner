package maze.model;

import maze.view.Maze;

public class ActionContinue implements StateTime{

	@Override
	public void doAction(Maze m) {
		m.s1.start();
		m.m1.start();
		
	}

}
