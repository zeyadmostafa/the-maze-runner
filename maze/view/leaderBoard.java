package maze.view;

import java.awt.EventQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFrame;
import javax.swing.JTextField;

import maze.model.careTaker;
import maze.model.mementoOfplayer;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class leaderBoard {

	private JFrame frmLeaderboard;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leaderBoard window = new leaderBoard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	JTextArea textArea;
	private JButton btnClose;
	public leaderBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLeaderboard = new JFrame();
		frmLeaderboard.getContentPane().setBackground(new Color(102, 204, 204));
		frmLeaderboard.setAlwaysOnTop(true);
		frmLeaderboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLeaderboard.setTitle("leaderBoard");
		frmLeaderboard.setResizable(false);
		frmLeaderboard.setBounds(100, 100, 450, 300);
		frmLeaderboard.getContentPane().setLayout(null);
		frmLeaderboard.setUndecorated(true);
		
		 textArea = new JTextArea();
		 textArea.setLineWrap(true);
		 textArea.setEditable(false);
		textArea.setBounds(6, 11, 434, 262);
		frmLeaderboard.getContentPane().add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 11, -13, 216);
		frmLeaderboard.getContentPane().add(scrollPane);
		
		btnClose = new JButton("Close");
		btnClose.setBackground(new Color(255, 255, 255));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLeaderboard.setVisible(false);
			}
		});
		btnClose.setFont(new Font("Tekton Pro Ext", Font.BOLD, 17));
		btnClose.setBounds(351, 277, 89, 23);
		frmLeaderboard.getContentPane().add(btnClose);
		






		
	}
	
	
	public void topPlayer() {
		careTaker ct =  new careTaker();
		//ct.readfile();
		Collections.sort(ct.listOfplayers,new Comparator<mementoOfplayer>() {
			
			public int compare(mementoOfplayer p2,mementoOfplayer p1 ) {
			return Integer.valueOf(p1.getScore()).compareTo(p2.getScore());
			}
		});
		int i=1;
			for(mementoOfplayer mementoOfplayers :ct.listOfplayers) {
				textArea.setText(textArea.getText() +i+")"+ " "+" player name :" + mementoOfplayers.getPlayerName()+ "   score: " + mementoOfplayers.getScore()+"   time taken: "+mementoOfplayers.getTimeTaken()+"  min "+  "\n" );
		i++;
			}
			frmLeaderboard.setVisible(true);
				}
 
	
	
	
}

