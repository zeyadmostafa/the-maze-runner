package maze.model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.SizeLimitExceededException;

public class careTaker {
	



	
		Scanner m;
		mementoOfplayer memento = new mementoOfplayer();
//		public mementoOfplayers [] listofplayers = new mementoOfplayers[20];
	static public	ArrayList<mementoOfplayer> listOfplayers = new ArrayList<mementoOfplayer>();
		//File f =  new File(".//src//maze//players.txt");	
		 //Scanner m = new Scanner(f);
		public void readfile() {
			//System.out.println("flag el read awel ma yfta7");
			FileReader f =  null ; 
			try {
			f= new FileReader("F://InvisibleNinjas-themaze-789cd767333a//src//maze//players.txt");
			}
			catch(Exception e)
			{
				//System.out.println("Error loading players file");
			}
				BufferedReader br= new BufferedReader (f);
				String line ;
					try {
					while((line =br.readLine())!=null)
					{
					 String [] list = line.split(" ");
					listOfplayers.add(new mementoOfplayer(list[0],Integer.parseInt(list[1]),Double.parseDouble(list[2])));
				//	System.out.println("flag 2");
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally
					{
					try {
						f.close();
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}

			
			
		}
		   
		     public void saveTofile() {
		    	 
		    	 BufferedWriter bw = null;
		 		FileWriter fw = null;
		 		
		 		try {
		 			fw = new FileWriter("F://InvisibleNinjas-themaze-789cd767333a//src//maze//players.txt");
		 		} catch (IOException e) {
		 			//  Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		bw = new BufferedWriter(fw);
		 		for(mementoOfplayer mementoOfplayers :listOfplayers)
		 		{	
		 			String score = Integer.toString(mementoOfplayers.score);
		 			String time = Double.toString(mementoOfplayers.timeTaken);
		 		
		 			try {
		 				bw.write(mementoOfplayers.playerName+" "+score+" "+time);
		 				bw.newLine();
		 				
		 			
		 			} catch (IOException e) {
		 				// TODO Auto-generated catch block
		 				e.printStackTrace();
		 			}
		 		}
		 		try {
		 			bw.close();
		 			fw.close();
		 		
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		    	 
		    	 
		    	 
		    	 
		    	 
		    	 
		    	
		    	 
		     }

}
