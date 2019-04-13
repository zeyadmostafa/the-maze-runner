package maze.controller;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	  private List<Observer> observers = new ArrayList<>();
	    private int state;

	    public void add(Observer o) {
	        observers.add(o);
	    }

	    public int getState() {
	        return state;
	    }

	    public void setState(int value,String name) {
	        this.state = value;
	        execute(name);
	    }

	    private void execute(String name) {
	        for (Observer observer : observers) {
	            observer.update(name);
	        }
	    }

}
