 package maze.view;
import maze.model.*;
import maze.controller.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class playernameWindow {

	public JFrame frame;
	private JTextField textField;
	Maze m ;
    mementoOfplayer memes = new mementoOfplayer() ;
    careTaker ct = new careTaker();
    Board b = new Board();
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playernameWindow window = new playernameWindow();
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
	public playernameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JLabel lblEnterUsername = new JLabel("Enter username");
		lblEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterUsername.setBounds(69, 104, 115, 29);
		frame.getContentPane().add(lblEnterUsername);
		
		textField = new JTextField();
		textField.setBounds(221, 110, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = textField.getText();
				System.out.println(name);
			    int score  = Board.myscore; // Integer.parseInt( m.Score.getText());
				double timeing =(double)(Double.parseDouble(Maze.seconds.getText())/10.0) + Double.parseDouble(Maze.minutes.getText());	
				memes.setPlayerName(name);
				memes.setScore(score);
				memes.setTimeTaken(timeing);
				careTaker.listOfplayers.add(memes) ;
				ct.saveTofile();
				frame.setVisible(false);
				//System.exit(0);
				Maze.GameStart.setVisible(true);
				Maze.toolBar.setVisible(false);
				Maze.Bd.setVisible(false);
				Maze.panel.setVisible(false);
			}
		});
		btnDone.setBounds(171, 170, 89, 23);
		frame.getContentPane().add(btnDone);
	}
}
