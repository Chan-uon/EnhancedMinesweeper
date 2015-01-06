import java.awt.BorderLayout;
import java.io.Serializable;
import javax.swing.JFrame;

/**
 * MineSweeper
 * @author Channy Uon 6189318, Cong Lu 3080021, Cedric Abou Farhat 7032633
 * An enhance Mine Sweeper game with additional features.
 */
class MineSweeper extends JFrame implements Serializable{
	private static final long serialVersionUID = 7174330829383401377L;

	/**
	 * MineSweeper()
	 * Constructor for the game.
	 */
	public MineSweeper(){
		
		//creating the frame
		setTitle("Enhanced Mine Sweeper");
		setSize(1000,700);
		
		//terminate application on close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//layout
		setLayout(new BorderLayout());
		
		//add all the components and the functionality to the frame
		new FrameComponents(this);
		
		//set the frame to be visible
		setVisible(true);
		
	}
	
}
