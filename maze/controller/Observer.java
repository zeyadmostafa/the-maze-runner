package maze.controller;

public abstract class Observer {
	
	    protected Subject subject;
	    public abstract void update(String name);
}
