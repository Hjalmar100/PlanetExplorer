package org.unioulu.tol.sqat2015.planetExplorer;
import model.*;
import java.awt.*;
import java.swing.*;
import javax.swing.BorderFactory;


// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:115
// Finish time:16:38
public class PlanetExplorer {
	public PlanetExplorer(int x, int y, String obstacles){
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)");/*	x and y represent the size of the grid.
		
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	setLayout(new BorderLayout(1,1));
	setPreferredSize(new Dimension (100,100));
	
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		public void createComponents (Container container){
			container.setLayout(new BorderLayout());
			
			container.add(new JButtom("f" (EAST)""),BorderLayout.EAST);
			container.add(new JButtom("b" (WEST)""),BorderLayout.WEST);
			container.add(new JButtom("l" (NORTH)""),BorderLayout.NORTH);
			container.add(new JButtom("r" (SOUTH)""),BorderLayout.SOUTH);
			container.setLocation(0,0);
			
			
		}
		
		public void createComponents (Container movement){
			container.setLayout(new BorderLayout());
			OwnPlatform = new OwnPlatform (7,6,N);
			
			platform.changeMoving(7,7,N);
			platform.changeMoving(5,8,E);
			platform.changeMoving(4,8,E);
			
			
			
		}
		
		
		return null;
	}
}
