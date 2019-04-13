package maze.view;

import javax.swing.*;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.Font;
import maze.controller.*;
import maze.model.careTaker;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Maze {
	
	public static int     bullet;
	public static boolean playerexist = false ;
    public static String  usercheck;
    public static String  winner;
    public static int ip ;
	JLabel ammo1 ;
	JLabel trump;
	private JLabel lblHealth;
	private JLabel label_1;
	private JLabel lblX;
	JLabel Health;
	JLabel armor;
	public  Health h ;
	public Subject subject;
	public Score s;
	JFrame f;
	JLabel Gun ;
    static	JLabel Score;
	int fl;
	public maze.model.bullet b = SingletonObject.getBullet();
	public static JPanel GameStart;
	public static JPanel toolBar;
	public static JPanel Bd;
	public static JPanel panel;
	public JButton btnStart;
	public Timer s1 ;
	public Timer m1 ;
	Board bo = new Board();
    static int flag = 0;
	int sec=1, min=2;
	static JLabel minutes;
	static JLabel seconds;
	static JLabel label;
	private JLabel lblNewLabel;
	private JButton btnLoad;
	
	public static void main(String[] args)
	{
		bullet = 6;
	careTaker ct = new careTaker();
	ct.readfile();
		Maze m = SingletonObject.getmaze();
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public Maze()
	{
		fl=0;
		subject = new Subject();
		h = new Health();
		s=new Score(subject);
		f = new JFrame();
		panel = new JPanel();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setBackground(Color.BLACK);
		f.setTitle("The Maze Runner");
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		Board board = new Board();
		board.setBounds(0, 5, 1160, 1294);
		board.setBackground(Color.WHITE);
    	f.getContentPane().add(panel,BorderLayout.CENTER);
    	panel.setLayout(null);
    	panel.add(board);
    	bullet = board.b.numberOfBullets;
    	toolBar = new JPanel();
    	toolBar.setBounds(1172, 23, 165, 1082);
    	panel.add(toolBar);
    	toolBar.setBackground(new Color(255, 255, 255));
    	 toolBar.setLayout(null);
    	
    	 ammo1 = new JLabel("");
    	 ammo1.setBounds(12, 441, 73, 63);
    	ammo1.setIcon(new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//gun.png"));
    	toolBar.add(ammo1);
    	
        
    	
    	trump = new JLabel("");
    	trump.setBounds(12, 0, 89, 94);
    	trump.setIcon(new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//Happy.gif"));
    	toolBar.add(trump);
    	
    	 Health = new JLabel(Integer.toString(h.gethealth()));
    	 Health.setHorizontalAlignment(SwingConstants.CENTER);
    	Health.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 30));
    	Health.setBounds(73, 34, 69, 30);
    	toolBar.add(Health);
    	
    	lblHealth = new JLabel("Health:");
    	lblHealth.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 17));
    	lblHealth.setBounds(85, 13, 68, 16);
    	toolBar.add(lblHealth);
    	
    	label_1 = new JLabel("");
    	label_1.setIcon(new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//armour.gif"));
    	label_1.setBounds(12, 333, 56, 63);
    	toolBar.add(label_1);
    	
    	lblX = new JLabel("x");
    	lblX.setFont(new Font("Dialog", Font.PLAIN, 24));
    	lblX.setBounds(85, 352, 16, 30);
    	toolBar.add(lblX);
    	
    	armor = new JLabel("2");
    	armor.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
    	armor.setBounds(105, 352, 56, 30);
    	toolBar.add(armor);
    	
    	JLabel lblScore = new JLabel("SCORE");
    	lblScore.setBackground(new Color(0, 0, 0));
    	lblScore.setForeground(new Color(102, 204, 204));
    	lblScore.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 18));
    	lblScore.setHorizontalAlignment(SwingConstants.CENTER);
    	lblScore.setBounds(0, 192, 141, 22);
    	toolBar.add(lblScore);
    	
    	 Score = new JLabel(Integer.toString(s.score));
    	 Score.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 21));
    	 Score.setHorizontalAlignment(SwingConstants.CENTER);
    	Score.setBounds(28, 222, 89, 46);
    	toolBar.add(Score);
    	
    	JLabel lblX_1 = new JLabel("X");
    	lblX_1.setFont(new Font("Tekton Pro", Font.PLAIN, 20));
    	lblX_1.setBounds(79, 453, 22, 30);
    	toolBar.add(lblX_1);
    	
    	 Gun = new JLabel("6");
    	Gun.setFont(new Font("Segoe WP SemiLight", Font.PLAIN, 24));
    	Gun.setBounds(109, 441, 44, 46);
    	toolBar.add(Gun);
    	
    	JLabel lblPressPTo = new JLabel("Press P to Pause");
    	lblPressPTo.setForeground(new Color(102, 204, 204));
    	lblPressPTo.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 16));
    	lblPressPTo.setBounds(0, 281, 161, 30);
    	toolBar.add(lblPressPTo);
    	
    	 seconds = new JLabel("..");
    	seconds.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
    	seconds.setHorizontalAlignment(SwingConstants.CENTER);
    	seconds.setBounds(92, 105, 35, 30);
    	toolBar.add(seconds);
    	
    	minutes = new JLabel("1");
    	minutes.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
    	minutes.setHorizontalAlignment(SwingConstants.CENTER);
    	minutes.setBounds(39, 105, 35, 30);
    	toolBar.add(minutes);
    	
    	label = new JLabel(":");
    	label.setHorizontalAlignment(SwingConstants.CENTER);
    	label.setBounds(73, 113, 15, 14);
    	toolBar.add(label);
    	
    	JButton btnNewButton = new JButton("leaderBoard ");
    	btnNewButton.setForeground(new Color(102, 204, 204));
    	btnNewButton.setBackground(new Color(255, 255, 255));
    	btnNewButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			leaderBoard l = new leaderBoard();
    			l.topPlayer();
    		}
    	});
    	btnNewButton.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 17));
    	btnNewButton.setBounds(12, 577, 149, 36);
    	toolBar.add(btnNewButton);
    	
    	
    	board.setVisible(false);
    	toolBar.setVisible(false);
    	
    	GameStart = new JPanel();
    	GameStart.setBackground(new Color(0, 0, 0));
    	GameStart.setBounds(0, 5, 1858, 1294);
    	panel.add(GameStart);
    	btnStart = new JButton("Start Game");
    	btnStart.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 19));
    	btnStart.setBounds(1018, 434, 375, 127);
    	btnStart.setBackground(new Color(102, 204, 204));
    	btnStart.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			board.setVisible(true);
    			toolBar.setVisible(true);
    			GameStart.setVisible(false);
    			minutes.setText("0");
    			s1.start();
    			m1.start();
    			flag = 0;
    		}
    	});
    	GameStart.setLayout(null);
    	GameStart.add(btnStart);
    	
    	lblNewLabel = new JLabel("");
    	lblNewLabel.setIcon(new ImageIcon("F://InvisibleNinjas-themaze-789cd767333a//src//maze//destroy the world.gif"));
    	lblNewLabel.setBounds(10, 11, 990, 725);
    	GameStart.add(lblNewLabel);
    	
    	btnLoad = new JButton("Load Game");
    	btnLoad.setBackground(new Color(102, 204, 204));
    	btnLoad.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			careTaker c = new careTaker();
    			 usercheck = JOptionPane.showInputDialog("enter user name to be check its existance");
    			
    			 for ( int i = 0 ; i<c.listOfplayers.size();i++) {
    				if (usercheck.equalsIgnoreCase(c.listOfplayers.get(i).getPlayerName())) {
    					ip=i;
    					playerexist = true ;
    					JOptionPane.showMessageDialog(null,"welcome " +usercheck +"\n your last score was "+c.listOfplayers.get(i).getScore());
    					board.setVisible(true);
    	    			toolBar.setVisible(true);
    	    			GameStart.setVisible(false);
    	    			s1.start();
    	    			m1.start();
    				}
    				
    				
    				
    			}if (playerexist==false) {
				JOptionPane.showMessageDialog(null, "sorry user doesnot exist ");}

    		}
    	});
    	btnLoad.setFont(new Font("Tekton Pro Ext", Font.BOLD, 18));
    	btnLoad.setBounds(1027, 611, 366, 109);
    	GameStart.add(btnLoad);
    	
    	JLabel Story = new JLabel("<html> The world is at risk of nuclear war and total destruction. <html>" 
    			+ "<html>Donald Trump needs your assistance to get through this maze to reach the red button of death to initialize World War III.<html>"
    			+ " <html>Help Donald not get himself killed in the process.<html>");
    	Story.setForeground(Color.RED);
    	Story.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 20));
    	Story.setBounds(1081, 0, 326, 449);
    	GameStart.add(Story);
		f.setSize(1769,1335);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	//	f.setUndecorated(true);
		
		
		s1 = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				seconds.setText(Integer.toString(sec));
				if(sec == 59)
				{
					sec = 0;
				}
				sec++;
			}
    		
    	});
		m1 = new Timer(60000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				minutes.setText(Integer.toString(min));
				min++;
			}
    		
    	});
		
	}
}