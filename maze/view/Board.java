package maze.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

import maze.controller.Health;
import maze.model.*;

import maze.model.Armour;
import maze.model.Bombs;
import maze.model.Gifts;
import maze.model.Player;
import maze.model.ScaryBomb;
import maze.model.Sprites;
import maze.model.bullet;
import maze.model.bulletGift;

public class Board extends JPanel implements ActionListener {
	
	private Timer timer ;
	private Sprites sprite ;
	private Player p;
	private Gifts gift ;
	private Armour armour ;
	private bulletGift bg ;
	private ActionDecreaseState state1;
	private ActionNoState state2;
	private Bombs bomb;
	private ScaryBomb scary;
	private String Message = "" ;
	private String direction = "d";
	private Health h;
	private ActionPause statePause;
	private ActionContinue stateCont;
    bullet b;
  //  bulletGift bullet;
    public static int flag  = 0;
    public static int flagj = 0;
    public static int flagb = 0;
    public static int flagk = 0;
    public static int flagl = 0;
    public static int flagp = 0;
    public static int flagt = 0;
    public static int flagn = 0;
    public static boolean minutesflag = false;
    
    public static boolean coin1 = true;
    public static boolean coin2 = true;
    public static boolean coin3 = true;
    public static boolean coin4 = true;
    public static boolean coin5 = true;
    public static boolean coin6 = true;
    public static boolean coin7 = true;
    public static boolean coin8 = true;
    public static boolean coin9 = true;
    public static boolean coin10 = true;
    public static boolean coin11 = true;
    public static boolean coin12 = true;
    
    public static boolean bulletgift = true;
    public static boolean bulletgiftt = true;
    
    public static boolean bomb1 = true;
    public static boolean bomb2 = true;
    public static boolean bomb3 = true;
    public static boolean bomb4 = true;
    public static boolean bomb5 = true;
    public static boolean bomb6 = true;
    public static boolean bomb7 = true;
    public static boolean bomb8 = true;
    public static boolean bomb9 = true;
    public static boolean bomb10= true;

    public static boolean Scarybomb1 = true;
    public static boolean Scarybomb2 = true;
    public static boolean Scarybomb3 = true;
    public static boolean Scarybomb4 = true;
    public static boolean Scarybomb5 = true;

    public static boolean hitbomb = false;
    public static boolean hitbomb1 = false;
    public static boolean hitbomb2 = false;
    public static boolean hitbomb3 = false;
    public static boolean hitbomb5 = false;
    public static boolean hitbomb6 = false;
    public static boolean hitbomb7 = false;
    public static boolean hitbomb8 = false;
    public static boolean hitbomb9 = false;
    public static boolean hitbomb10 = false;


    public static boolean hitscarybomb1 = false;
    public static boolean hitscarybomb2 = false;
    public static boolean hitscarybomb3 = false;
    public static boolean hitscarybomb4 = false;
    public static boolean hitscarybomb5 = false;
   
    public static boolean armourflag = true;
    public static boolean healthflag = true;
    public static boolean winner = false;
    
    public static int myscore ;

    
	public Board()
	{
		
		sprite = SingletonObject.getS();
		p = SingletonObject.getPlayer();
		armour = new Armour();
		gift = new Gifts();
		h = new Health();
		bomb = new Bombs();
		bg = new bulletGift();
		scary = new ScaryBomb();
		state1=new ActionDecreaseState();
		state2 = new ActionNoState();
		stateCont = new ActionContinue();
		statePause= new ActionPause();
		addKeyListener(new Al());
		
		setFocusable(true);
		timer = new Timer(25, this);
		timer.start();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		for (int y=0; y<20; y++) ///number of row
		{
			for(int x=0; x<30; x++) ///number of tiles in a row
			{
				if(sprite.getMap(x, y).equals("e"))
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("f") ) // If equals "f", put a floor
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("w")) // If equals "w", put a wall
				{
					g.drawImage(sprite.getwall(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("b")||sprite.getMap(x, y).equals("j")||sprite.getMap(x, y).equals("k")
				||sprite.getMap(x, y).equals("l") ||sprite.getMap(x, y).equals("p") ||sprite.getMap(x, y).equals("t") ||sprite.getMap(x, y).equals("n")) // If equals "b", put some bushes
				{
					g.drawImage(sprite.getbushes(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("b") && flagb == 2)
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("j") && flagj == 2)
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("k") && flagk == 2)
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("p") && flagp == 2)
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("l") && flagl == 2)
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("t") && flagt == 2)
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				if(sprite.getMap(x, y).equals("n") && flagn == 2)
				{
					g.drawImage(sprite.getfloor(), x*37, y*37, null);
				}
				
			}
			
		}
		
	    g.drawImage(sprite.getfinish(), 28*37 ,19*37 ,null);

				 
		    if(direction.equals("u"))
		    {
			    g.drawImage(p.getbackplayer(), p.gettileX()*37 , p.gettileY()*37 , null);

		    }
		    
		    if(direction.equals("d"))
		    {
		    	g.drawImage(p.getfrontplayer(), p.gettileX()*37 , p.gettileY()*37 , null);
		    }
		    
		    if(direction.equals("l"))
		    {
		    	g.drawImage(p.getleftplayer(), p.gettileX()*37 , p.gettileY()*37 , null);
		    }
		    
		    if(direction.equals("r"))
		    {
		    	g.drawImage(p.getrightplayer(), p.gettileX()*37 , p.gettileY()*37 , null);
		    }
		    if(armourflag)
		    {
		    	g.drawImage(armour.getgift(), armour.gettileX()*37, armour.gettileY()*37, null);
		    }
		    
		    if(coin1)
	        {
		    	g.drawImage(gift.getgift(), gift.gettileX()*37 , gift.gettileY()*37 , null); //gift 1

	        }
		    if(coin2)
		    {
                g.drawImage(gift.getgift(), gift.gettileX1()*37 , gift.gettileY1()*37 , null); // gift 2

		    }
		    if(coin3)
		    {
                g.drawImage(gift.getgift(), gift.gettileX2()*37 , gift.gettileY2()*37 , null); // gift 3
		    }
		    if(coin4)
		    {
                g.drawImage(gift.getgift(), gift.gettileX3()*37 , gift.gettileY3()*37 , null); // gift 4
		    }
		    if(coin5)
		    {
                g.drawImage(gift.getgift(), gift.getTileX5()*37 , gift.getTileY5()*37 , null); // gift 4
		    }
		    
		    if(coin6)
		    {
                g.drawImage(gift.getgift(), gift.getTileX6()*37 , gift.getTileY6()*37 , null); // gift 4
		    }
		    if(coin7)
		    {
                g.drawImage(gift.getgift(), gift.getTileX7()*37 , gift.getTileY7()*37 , null); // gift 4
		    }
		    if(coin8)
		    {
                g.drawImage(gift.getgift(), gift.getTileX8()*37 , gift.getTileY8()*37 , null); // gift 4
		    }
		    if(coin9)
		    {
                g.drawImage(gift.getgift(), gift.getTileX9()*37 , gift.getTileY9()*37 , null); // gift 4
		    }
		    if(coin10)
		    {
                g.drawImage(gift.getgift(), gift.getTileX10()*37 , gift.getTileY10()*37 , null); // gift 4
		    }
		    if(coin11)
		    {
                g.drawImage(gift.getgift(), gift.getTileX11()*37 , gift.getTileY11()*37 , null); // gift 4
		    }
		    if(coin12)
		    {
                g.drawImage(gift.getgift(), gift.getTileX12()*37 , gift.getTileY12()*37 , null); // gift 4
		    }
		    if(healthflag)
		    {
                g.drawImage(gift.gethealth(), gift.gettileX4()*37 , gift.gettileY4()*37 , null); // gift 3
		    }
		    
		    if(bulletgift)
		    {
                g.drawImage(bg.getbullet(), bg.gettileX()*37 , bg.gettileY()*37 , null); // gift 5
		    }
		    if(bulletgiftt)
		    {
                g.drawImage(bg.getbullet(), bg.gettileX1()*37 , bg.gettileY1()*37 , null); // gift 5
		    }
		    
		    if(bomb1 && !hitbomb1)
	        {
	            g.drawImage(bomb.getbomb(), bomb.gettileX()*37 , bomb.gettileY()*37 , null);

	        }
		    if(bomb2 && !hitbomb2)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX1()*37 , bomb.gettileY1()*37 , null);

		    }
		    if(bomb3 && !hitbomb3)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX2()*37 , bomb.gettileY2()*37 , null);

		    }
		    if(bomb4 && !hitbomb)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX3()*37 , bomb.gettileY3()*37 , null);
		    }
		    if(bomb5 && !hitbomb5)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX4()*37 , bomb.gettileY4()*37 , null);
		    }
		    if(bomb6 && !hitbomb6)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX5()*37 , bomb.gettileY5()*37 , null);
		    }
		    if(bomb7 && !hitbomb7)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX6()*37 , bomb.gettileY6()*37 , null);
		    }
		    if(bomb8 && !hitbomb8)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX7()*37 , bomb.gettileY7()*37 , null);
		    }
		    if(bomb9 && !hitbomb9)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX8()*37 , bomb.gettileY8()*37 , null);
		    }
		    if(bomb10 && !hitbomb10)
		    {
	            g.drawImage(bomb.getbomb(), bomb.gettileX9()*37 , bomb.gettileY9()*37 , null);
		    }
		    if(Scarybomb1 && !hitscarybomb1)
		    {
	            g.drawImage(scary.getbomb(), scary.gettileX()*37 , scary.gettileY()*37 , null);
		    }
		    if(Scarybomb2 && !hitscarybomb2)
		    {
	            g.drawImage(scary.getbomb(), scary.gettileX1()*37 , scary.gettileY1()*37 , null);
		    }
		    if(Scarybomb3 && !hitscarybomb3)
		    {
	            g.drawImage(scary.getbomb(), scary.gettileX2()*37 , scary.gettileY2()*37 , null);
		    }
		    if(Scarybomb4 && !hitscarybomb4)
		    {
	            g.drawImage(scary.getbomb(), scary.gettileX3()*37 , scary.gettileY3()*37 , null);
		    }
		    if(Scarybomb5 && !hitscarybomb5)
		    {
	            g.drawImage(scary.getbomb(), scary.gettileX4()*37 , scary.gettileY4()*37 , null);
		    }
		  
	        
			repaint();
	}

	public class Al implements KeyListener
	{
		

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			Maze m = SingletonObject.getmaze();
			Board bo = new Board();
			int keycode = e.getKeyCode();
			
			if(keycode == KeyEvent.VK_UP)
			{
				if (sprite.getMap((p.gettileX()), p.gettileY()-1).equals("j")&&(flag==1||flagj==2)) {
					p.move( 0, -1);
					direction = "u";
					flag=0;
					flagj=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()-1).equals("b")&&(flag==1||flagb==2)) {
					p.move( 0, -1);
					direction = "u";
					flag=0;
					flagb=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()-1).equals("k")&&(flag==1||flagk==2)) {
					p.move( 0, -1);
					direction = "u";
					flag=0;
					flagk=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()-1).equals("n")&&(flag==1||flagn==2)) {
					p.move( 0, -1);
					direction = "u";
					flag=0;
					flagn=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()-1).equals("p")&&(flag==1||flagp==2)) {
					p.move( 0, -1);
					direction = "u";
					flag=0;
					flagp=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()-1).equals("t")&&(flag==1||flagt==2)) {
					p.move( 0, -1);
					direction = "u";
					flag=0;
					flagt=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()-1).equals("l")&&(flag==1||flagl==2)) {
					p.move( 0, -1);
					direction = "u";
					flag=0;
					flagl=2;
				}
				else if(sprite.getMap(p.gettileX(), (p.gettileY()-1)  ).equals("f") || sprite.getMap(p.gettileX(), (p.gettileY()-1)  ).equals("e") )
				{
					p.move( 0, -1);
					direction = "u";
					flag=0;
				}
			}
			if(keycode == KeyEvent.VK_DOWN)
			{
				if (sprite.getMap((p.gettileX()), p.gettileY()+1).equals("j")&&(flag==1||flagj==2)) {
					p.move( 0, 1);
					direction = "d";
					flag=0;	
					flagj=2;
					}
				else if (sprite.getMap((p.gettileX()), p.gettileY()+1).equals("b")&&(flag==1||flagb==2)) {
					p.move( 0, 1);
					direction = "d";
					flag=0;
					flagb=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()+1).equals("k")&&(flag==1||flagk==2)) {
					p.move( 0, 1);
					direction = "d";
					flag=0;
					flagk=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()+1).equals("n")&&(flag==1||flagn==2)) {
					p.move( 0, 1);
					direction = "d";
					flag=0;
					flagn=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()+1).equals("p")&&(flag==1||flagp==2)) {
					p.move( 0, 1);
					direction = "d";
					flag=0;
					flagp=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()+1).equals("t")&&(flag==1||flagt==2)) {
					p.move( 0, 1);
					direction = "d";
					flag=0;
					flagt=2;
				}
				else if (sprite.getMap((p.gettileX()), p.gettileY()+1).equals("l")&&(flag==1||flagl==2)) {
					p.move( 0, 1);
					direction = "d";
					flag=0;
					flagl=2;
				}
				else if(sprite.getMap(p.gettileX(), (p.gettileY()+1)  ).equals("f") || sprite.getMap(p.gettileX(), (p.gettileY()+1)  ).equals("e") )
				{
					p.move( 0, 1);
					direction = "d";
					flag=0;
				}
			
			}
			if(keycode == KeyEvent.VK_LEFT)
			{
				if(!sprite.getMap((p.gettileX()-1), p.gettileY()).equals("w") )
				{
					p.move( -1, 0);
					direction = "l";
				}
			}
			if(keycode == KeyEvent.VK_RIGHT)
			{
				if(!sprite.getMap((p.gettileX()+1), p.gettileY()).equals("w") )
				{
					p.move( 1, 0);
					direction = "r";
				}
			}
			if(keycode == KeyEvent.VK_P)
			{
				statePause.doAction(m);
				Object[] options = {"RESUME"};
				JOptionPane.showOptionDialog(m.f, "", "PAUSE", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
						new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//donaldWait.gif"), options, options[0] );
			
				stateCont.doAction(m);
			}
			
			else if(keycode == KeyEvent.VK_SPACE && bullet.numberOfBullets > 0)
			{
				
				//fire gun
				if((p.gettileX() == 1 && p.gettileY() == 7))
				{
					if(b.numberOfBullets > 0)
					hitbomb = true ;
				}
				if((p.gettileX() == 5 && p.gettileY() == 4)  )
				{
					if(b.numberOfBullets > 0)
					hitbomb2 = true ;
				}
				if(p.gettileX() == 4 && p.gettileY() == 1)
				{
					if(b.numberOfBullets > 0)
					hitbomb1 = true ;
				}
				if((p.gettileX() == 14 && p.gettileY() == 9)  )
				{
					if(b.numberOfBullets > 0)
					hitbomb3 = true ;
				}
				if((p.gettileX() == 14 && p.gettileY() == 1))
				{
					if(b.numberOfBullets > 0)
					hitbomb5 = true ;
				}
				if((p.gettileX() == 28 && p.gettileY() == 6))
				{
					if(b.numberOfBullets > 0)
					hitbomb6 = true ;
				}
				if((p.gettileX() == 6 && p.gettileY() == 13)  )
				{
					if(b.numberOfBullets > 0)
					hitbomb7 = true ;
				}
				if(p.gettileX() == 17 && p.gettileY() == 14)
				{
					if(b.numberOfBullets > 0)
					hitbomb8 = true ;
				}
				if((p.gettileX() == 21 && p.gettileY() == 12)  )
				{
					if(b.numberOfBullets > 0)
					hitbomb9 = true ;
				}
				if((p.gettileX() == 13 && p.gettileY() == 16))
				{
					if(b.numberOfBullets > 0)
					hitbomb10 = true ;
				}
					
				/////////*****************////////
				
				if((p.gettileX() == 28 && p.gettileY() == 14))
				{
					if(b.numberOfBullets > 0)
					hitscarybomb1 = true ;
				}
				if((p.gettileX() == 17 && p.gettileY() == 5) )
				{
					if(b.numberOfBullets > 0)
					hitscarybomb2 = true ;
				}
				if (p.gettileX() == 6 && p.gettileY() == 16 )
				{
					if(b.numberOfBullets > 0)
					hitscarybomb3 = true ;
				}
				if((p.gettileX() == 6 && p.gettileY() == 8) || (p.gettileX() == 7 && p.gettileY() == 9))
				{
					if(b.numberOfBullets > 0)
					hitscarybomb4 = true ;
				}
				if((p.gettileX() == 15 && p.gettileY() == 9) )
				{
					if(b.numberOfBullets > 0)
					hitscarybomb5 = true ;
				}
				
				bullet.numberOfBullets--;
				m.Gun.setText(Integer.toString(bullet.numberOfBullets));
					if(bullet.numberOfBullets<0)
					bullet.numberOfBullets=0;
					
				
				flag = 1;		
			}
		    else if(keycode == KeyEvent.VK_ESCAPE)
		    {
		    	System.exit(0);
		    }
			if(p.gettileX() == bg.gettileX() && p.gettileY() == bg.gettileY())
			{
				bullet.numberOfBullets++;
				m.Gun.setText(Integer.toString(bullet.numberOfBullets));
				bulletgift=false;
			}
			else if(p.gettileX() == bg.gettileX1() && p.gettileY() == bg.gettileY1())
			{
				bullet.numberOfBullets++;
				m.Gun.setText(Integer.toString(bullet.numberOfBullets));
				bulletgiftt=false;
			}
			
			if(p.gettileX()==scary.gettileX() && p.gettileY() == scary.gettileY())
			{
				
			  if(Scarybomb1 && !hitscarybomb1)
				{if(armour.armourNum !=0)
				{
				//	armour.armourNum--;
					state2.doActionScary(armour, m);
					m.armor.setText ( Integer.toString(armour.armourNum));
					Scarybomb1 = false ;
				}
				else if(armour.armourNum == 0)
				{
					state1.doActionScary(armour, m);
			   // 	m.h.setHealth("scary");
			    	m.Health.setText(Integer.toString(m.h.gethealth()));
			    	
					Scarybomb1 = false ;
				}
				Object[] options = {"BOMB"};
				JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
						new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
				}
			}
				else if(p.gettileX()==scary.gettileX1() && p.gettileY() == scary.gettileY1())
				{
				  if(Scarybomb2 && !hitscarybomb2)
					{if(armour.armourNum !=0)
					{
						state2.doActionScary(armour, m);
						//armour.armourNum--;
						m.armor.setText ( Integer.toString(armour.armourNum));
						Scarybomb2 = false ;
					}
					else
					{
						state1.doActionScary(armour, m);
				//	m.h.setHealth("scary");
					m.Health.setText(Integer.toString(m.h.gethealth()));
					Scarybomb2 = false ;
					Object[] options = {"BOMB"};
										}	
					 Object[] options = {"BOMB"};
						JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
								new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
					}
				}
				  else if(p.gettileX()==scary.gettileX2() && p.gettileY() == scary.gettileY2())
					{
					  if(Scarybomb3 && !hitscarybomb3)
						{if(armour.armourNum !=0)
						{
							state2.doActionScary(armour, m);
						//	armour.armourNum--;
							m.armor.setText ( Integer.toString(armour.armourNum));
							Scarybomb3 = false ;
						}
						else
						{
							state1.doActionScary(armour, m);
					//	m.h.setHealth("scary");
						m.Health.setText(Integer.toString(m.h.gethealth()));
						Scarybomb3 = false ;
						Object[] options = {"BOMB"};
											}	
						 Object[] options = {"BOMB"};
							JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
									new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
						}
					}
					  else if(p.gettileX()==scary.gettileX3() && p.gettileY() == scary.gettileY3())
						{
						  if(Scarybomb4 && !hitscarybomb4)
							{
							  if(armour.armourNum !=0)
							{
								  state2.doActionScary(armour, m);
							//	armour.armourNum--;
								m.armor.setText ( Integer.toString(armour.armourNum));
								Scarybomb4 = false ;
							}
							else
							{
								state1.doActionScary(armour, m);
						//	m.h.setHealth("scary");
							m.Health.setText(Integer.toString(m.h.gethealth()));
							Scarybomb4 = false ;
							Object[] options = {"BOMB"};
												}	
							 Object[] options = {"BOMB"};
								JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
										new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
							}
						}
			
					  else if(p.gettileX()==scary.gettileX4() && p.gettileY() == scary.gettileY4())
						{
						  if(Scarybomb5 && !hitscarybomb5)
							{
							  if(armour.armourNum !=0)
							{
								  state2.doActionScary(armour, m);
							//	armour.armourNum--;
								m.armor.setText ( Integer.toString(armour.armourNum));
								Scarybomb5 = false ;
							}
							else
							{
								state1.doActionScary(armour, m);
						//	m.h.setHealth("scary");
							m.Health.setText(Integer.toString(m.h.gethealth()));
							Scarybomb5 = false ;
							Object[] options = {"BOMB"};
												}	
							 Object[] options = {"BOMB"};
								JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
										new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
							}
						}
				 
			
			if(p.gettileX()==bomb.gettileX() && p.gettileY() == bomb.gettileY())
			{
				
			  if(bomb1 && !hitbomb1)
				{if(armour.armourNum !=0)
				{
					state2.doActionBomb(armour, m);
				//	armour.armourNum--;
					m.armor.setText ( Integer.toString(armour.armourNum));
					bomb1 = false ;
				}
				else if(armour.armourNum == 0)
				{
					state1.doActionBomb(armour, m);
			    //	m.h.setHealth("bomb");
			    	m.Health.setText(Integer.toString(m.h.gethealth()));
			    	
					bomb1 = false ;
				}
				Object[] options = {"BOMB"};
				JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
						new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
				}
			   
			  
			}
				else if(p.gettileX()==bomb.gettileX1() && p.gettileY() == bomb.gettileY1())
				{
				  if(bomb2 && !hitbomb2)
					{if(armour.armourNum !=0)
					{
						state2.doActionBomb(armour, m);
					//	armour.armourNum--;
						m.armor.setText ( Integer.toString(armour.armourNum));
						bomb2 = false ;
					}
					else
					{
						state1.doActionBomb(armour, m);
					//	m.h.setHealth("bomb");
					m.Health.setText(Integer.toString(m.h.gethealth()));
					bomb2 = false ;
					Object[] options = {"BOMB"};
										}	
					 Object[] options = {"BOMB"};
						JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
								new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
					}
				 
			}
				else if(p.gettileX()==bomb.gettileX2() && p.gettileY() == bomb.gettileY2())
				{
					if(bomb3 && !hitbomb3)
					{if(armour.armourNum !=0)
					{
						state2.doActionBomb(armour, m);
					//	armour.armourNum--;
						m.armor.setText ( Integer.toString(armour.armourNum));
						bomb3 = false ;
					}
					else
					{
						state1.doActionBomb(armour, m);
				//		m.h.setHealth("bomb");
					    m.Health.setText(Integer.toString(m.h.gethealth()));
					    bomb3 = false ;
					    
					}
					Object[] options = {"BOMB"};
					JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
							new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
					}
					
			}
				else if(p.gettileX()==bomb.gettileX3() && p.gettileY() == bomb.gettileY3())
			{
				if(bomb4 && !hitbomb)
				{
					if(armour.armourNum !=0)
					{
						state2.doActionBomb(armour, m);
				//		armour.armourNum--;
						flag = 1;
						m.armor.setText ( Integer.toString(armour.armourNum));
						bomb4 = false ;
					
					}
					else
					{
						state1.doActionBomb(armour, m);
					//	m.h.setHealth("bomb");
					    m.Health.setText(Integer.toString(m.h.gethealth()));
					    bomb4 = false ;
					    
					}
					Object[] options = {"BOMB"};
					JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
							new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
				}
				
			}
				else if(p.gettileX()==bomb.gettileX4() && p.gettileY() == bomb.gettileY4())
				{
				  if(bomb5 && !hitbomb5)
					{if(armour.armourNum !=0)
					{
						state2.doActionBomb(armour, m);
					//	armour.armourNum--;
						m.armor.setText ( Integer.toString(armour.armourNum));
						bomb5 = false ;
					}
					else
					{
						state1.doActionBomb(armour, m);
					//	m.h.setHealth("bomb");
					m.Health.setText(Integer.toString(m.h.gethealth()));
					bomb5 = false ;
					Object[] options = {"BOMB"};
										}	
					 Object[] options = {"BOMB"};
						JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
								new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
					}
				}  
				  else if(p.gettileX()==bomb.gettileX5() && p.gettileY() == bomb.gettileY5())
					{
					  if(bomb6 && !hitbomb6)
						{if(armour.armourNum !=0)
						{
							state2.doActionBomb(armour, m);
						//	armour.armourNum--;
							m.armor.setText ( Integer.toString(armour.armourNum));
							bomb6 = false ;
						}
						else
						{
							state1.doActionBomb(armour, m);
						//	m.h.setHealth("bomb");
						m.Health.setText(Integer.toString(m.h.gethealth()));
						bomb6 = false ;
						Object[] options = {"BOMB"};
											}	
						 Object[] options = {"BOMB"};
							JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
									new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
						}
					 
				}
				  
				  else if(p.gettileX()==bomb.gettileX6() && p.gettileY() == bomb.gettileY6())
					{
					  if(bomb7 && !hitbomb7)
						{if(armour.armourNum !=0)
						{
							state2.doActionBomb(armour, m);
						//	armour.armourNum--;
							m.armor.setText ( Integer.toString(armour.armourNum));
							bomb7 = false ;
						}
						else
						{
							state1.doActionBomb(armour, m);
						//	m.h.setHealth("bomb");
						m.Health.setText(Integer.toString(m.h.gethealth()));
						bomb7 = false ;
						Object[] options = {"BOMB"};
											}	
						 Object[] options = {"BOMB"};
							JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
									new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
						}
					 
				}
				  else if(p.gettileX()==bomb.gettileX7() && p.gettileY() == bomb.gettileY7())
					{
					  if(bomb8 && !hitbomb8)
						{if(armour.armourNum !=0)
						{
							state2.doActionBomb(armour, m);
						//	armour.armourNum--;
							m.armor.setText ( Integer.toString(armour.armourNum));
							bomb8 = false ;
						}
						else
						{
							state1.doActionBomb(armour, m);
						//	m.h.setHealth("bomb");
						m.Health.setText(Integer.toString(m.h.gethealth()));
						bomb8 = false ;
						Object[] options = {"BOMB"};
											}	
						 Object[] options = {"BOMB"};
							JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
									new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
						}
					 
				}
				  else if(p.gettileX()==bomb.gettileX8() && p.gettileY() == bomb.gettileY8())
					{
					  if(bomb9 && !hitbomb9)
						{if(armour.armourNum !=0)
						{
							state2.doActionBomb(armour, m);
						//	armour.armourNum--;
							m.armor.setText ( Integer.toString(armour.armourNum));
							bomb9 = false ;
						}
						else
						{
							state1.doActionBomb(armour, m);
						//	m.h.setHealth("bomb");
						m.Health.setText(Integer.toString(m.h.gethealth()));
						bomb9 = false ;
						Object[] options = {"BOMB"};
											}	
						 Object[] options = {"BOMB"};
							JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
									new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
						}
					 
				}
				  else if(p.gettileX()==bomb.gettileX9() && p.gettileY() == bomb.gettileY9())
					{
					  if(bomb10 && !hitbomb10)
						{if(armour.armourNum !=0)
						{
							state2.doActionBomb(armour, m);
						//	armour.armourNum--;
							m.armor.setText ( Integer.toString(armour.armourNum));
							bomb10 = false ;
						}
						else
						{
							state1.doActionBomb(armour, m);
						//	m.h.setHealth("bomb");
						m.Health.setText(Integer.toString(m.h.gethealth()));
						bomb10 = false ;
						Object[] options = {"BOMB"};
											}	
						 Object[] options = {"BOMB"};
							JOptionPane.showOptionDialog(m.f, "", "BOMBED", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
									new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//seriously.gif"), options, options[0] );
						}
					 
				}



			if(m.h.gethealth() <=50)
			{
				m.trump.setIcon(new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//HalfHalf.gif"));
			}
			
			if(p.gettileX() == 28 && p.gettileY() == 19)
			{
				m.s1.stop();
				m.m1.stop();
                  Object[] options = {"WINNER"};
                  JOptionPane.showOptionDialog(m.f, "", "YOU WIN", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
	              new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//YouWin.gif"), options, options[0] );
              myscore= Integer.parseInt( m.Score.getText());
                  playernameWindow pw = new playernameWindow();
              	if (m.playerexist) {
              		
              		careTaker c = new careTaker();
              		//int score  = myscore; // Integer.parseInt( m.Score.getText());
    				double timeing1 =(Double.parseDouble(m.seconds.getText())/10.0) + Double.parseDouble(m.minutes.getText());	
    	//	c.listOfplayers.remove(m.ip);
    				
    				c.listOfplayers.get(m.ip).setScore(myscore);
    				c.listOfplayers.get(m.ip).setTimeTaken(0);
    			c.listOfplayers.get(m.ip).setTimeTaken(timeing1);
    			c.listOfplayers.get(m.ip).setPlayerName(m.usercheck);
    				/*memes.setPlayerName(name);
    				memes.setScore(score);
    				memes.setTimeTaken(timeing);
    				ct.listOfplayers.add(memes) ;*/
    				c.saveTofile();

    				m.minutes.setText("...");
    				m.min = 1;
    				m.sec = 1;
    				m.m1.start();
    				m.s1.start();
              	}
              	
                if(m.playerexist==false) {  pw.frame.setVisible(true);}
                  
				  m.Health.setText(Integer.toString(100));
				  m.trump.setIcon(new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//Happy.gif"));
                  bo.initialize();
                  m.sec = 1;
                  m.s1.restart(); 
                  m.min =0;
                  m.m1.restart();
                  bullet.numberOfBullets = 6;
                  m.Gun.setText(Integer.toString(bullet.numberOfBullets));
                  armour.armourNum = 2 ;
                  m.armor.setText(Integer.toString(armour.armourNum));
                  m.s.score = 0;
                  m.Score.setText(Integer.toString(m.s.score));
                  
			}
			 if (m.h.gethealth()<=0)
			{
				  Object[] options = {"END GAME"};
				  JOptionPane.showOptionDialog(m.f, "GAME OVER", "BO HO", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, 
			      new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//loser.gif"), options, options[0] );
				  System.exit(0);
			}
			 if(p.gettileX()==armour.gettileX()&&p.gettileY()==armour.gettileY())
			 {
				 if(armourflag)
				 {
					 armour.armourNum++;
					 m.subject.setState(1, "Armour");
				   //  m.s.update("Armour");
				     m.armor.setText(Integer.toString(armour.armourNum));
				     m.Score.setText(Integer.toString(m.s.score));
				     armourflag = false;
				 }
			 }
			 if(p.gettileX()==gift.gettileX() && p.gettileY() == gift.gettileY())
			 {
				 if(coin1)
				 {
					 m.s.update("Gift");
				     m.Score.setText(Integer.toString(m.s.score));
				     coin1 = false ;
				 }
			 }
			 else if(p.gettileX()==gift.gettileX1() && p.gettileY() == gift.gettileY1())
			 {
				 if(coin2)
				 {
					 m.s.update("Gift");
				     m.Score.setText(Integer.toString(m.s.score));
				     coin2 = false;
				 }
			 }
			 else  if(p.gettileX()==gift.gettileX2() && p.gettileY() == gift.gettileY2())
			 {
				if(coin3)
				{ m.s.update("Gift");
				 m.Score.setText(Integer.toString(m.s.score));
				 coin3 = false;
				}
			 }
			 else if(p.gettileX()==gift.gettileX3() && p.gettileY() == gift.gettileY3())
			 {
				if(coin4)
				{ m.s.update("Gift");
				 m.Score.setText(Integer.toString(m.s.score));
				 coin4 = false;
				}
			 }
				else if(p.gettileX() == gift.gettileX4() && p.gettileY() == gift.gettileY4())
				{
					if(healthflag)
					{ 
					    m.Health.setText(Integer.toString(m.h.increasehealth()));
					    healthflag = false;
					}
				}
			 
				 else if(p.gettileX()==gift.getTileX5() && p.gettileY() == gift.getTileY5())
				 {
					 if(coin5)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin5 = false;
					 }
				 }
				 else if(p.gettileX()==gift.getTileX6() && p.gettileY() == gift.getTileY6())
				 {
					 if(coin6)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin6 = false;
					 }
				 }
				 else if(p.gettileX()==gift.getTileX7() && p.gettileY() == gift.getTileY7())
				 {
					 if(coin7)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin7 = false;
					 }
				 }
				 else if(p.gettileX()==gift.getTileX8() && p.gettileY() == gift.getTileY8())
				 {
					 if(coin8)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin8 = false;
					 }
				 }
				 else if(p.gettileX()==gift.getTileX9() && p.gettileY() == gift.getTileY9())
				 {
					 if(coin9)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin9 = false;
					 }
				 }
				 else if(p.gettileX()==gift.getTileX10() && p.gettileY() == gift.getTileY10())
				 {
					 if(coin10)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin10 = false;
					 }
				 }
				 else if(p.gettileX()==gift.getTileX11() && p.gettileY() == gift.getTileY11())
				 {
					 if(coin11)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin11 = false;
					 }
				 }
				 else if(p.gettileX()==gift.getTileX12() && p.gettileY() == gift.getTileY12())
				 {
					 if(coin12)
					 {
						 m.s.update("Gift");
					     m.Score.setText(Integer.toString(m.s.score));
					     coin12 = false;
					 }
				 }
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	}
	
	public void initialize()
	{
        p.settileX() ;
        p.settileY() ;
        
           flag  = 0;
           flagj = 0;
           flagb = 0;
           flagk = 0;
           flagl = 0;
           flagp = 0;
           flagt = 0;
           flagn = 0;
        
         coin1 = true;
         coin2 = true;
         coin3 = true;
         coin4 = true;
         coin5 = true;
         coin6 = true;
         coin7 = true;
         coin8 = true;   
         coin9 = true;
         coin10 = true;
         coin11 = true;
         coin12 = true;
         
         bulletgift = true;
         bulletgiftt = true;
        
         bomb1 = true;
         bomb2 = true;
         bomb3 = true;
         bomb4 = true;
         bomb5 = true;
         bomb6 = true;
         bomb7 = true;
         bomb8 = true;
         bomb9 = true;
         bomb10 = true;
        
         Scarybomb1 = true;
         Scarybomb2 = true;
         Scarybomb3 = true;
         Scarybomb4 = true;
         Scarybomb5 = true;
      
         hitbomb = false;
         hitbomb1 = false;
         hitbomb2 = false;
         hitbomb3 = false;
         hitbomb5 = false;
         hitbomb6 = false;
         hitbomb7 = false;  
         hitbomb8 = false;
         hitbomb9 = false;
         hitbomb10 = false;
         
         hitscarybomb1 = false;
         hitscarybomb2 = false;
         hitscarybomb3 = false;
         hitscarybomb4 = false;
         hitscarybomb5 = false;
        
         armourflag = true;
         healthflag = true;
	}
}


