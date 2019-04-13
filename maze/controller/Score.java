package maze.controller;

public class Score extends Observer {
	public int score;
	public Score(Subject subject)
	{
		this.subject = subject;
		this.subject.add(this);
		score=0;
	}
	public void update(String name)
	{
		if(name.equals("Gift"))
		this.score=score+20;
		else if(name.equals("Armour"))
			this.score=score+10;	
	}
}
