import java.awt.EventQueue;

import javax.swing.UIManager;

/**
 * Project: Enhanced MineSweeper
 * @author Channy Uon, Cong Lu, Cedric Abou Farhat
 *
 * Program Description:
 * An enhanced Mine Sweeper game that has most, if not all, the functionality
 * of the original Mine Sweeper game (mines, flags, reset and score) as well as a few new features.
 * New features includes the functionality to allow a player to save/load the current
 * game state, the concept of multiples lives, multiple mines under a cell
 * and the introduction of additional items like a probe, shield, bonus time and immortality.
 */

public class EnhancedMineSweeper {

	public static void main(String[] args) {
		
		//create the GUI and run the game in the event dispatch thread
		EventQueue.invokeLater(new Runnable() {
			public void run(){	
				//for cross platform look and feel
				try {
				    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
				 } catch (Exception e) {
				            e.printStackTrace();
				 }
				new MineSweeper();
			}
		});
	}
}
