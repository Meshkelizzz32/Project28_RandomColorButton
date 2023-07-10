package project7;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class RandomColBut extends JButton{
	private static final Color[] colors= {
			 Color.black, Color.blue, Color.cyan,
			 Color.darkGray, Color.gray, Color.green,
			 Color.lightGray, Color.magenta,
			 Color.orange, Color.pink, Color.red,
			 Color.white, Color.yellow 
	};
	private static Random rand=new Random();
	private static Color  newColor() {
		return colors[rand.nextInt(colors.length)];
	}
	public RandomColBut(String text) {
		super(text);
		setBackground(newColor());
		addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			 setBackground(newColor());
			 }
			 }); 
	}
}

public class RandomColorButton extends JFrame{
	RandomColorButton(){
		add(new RandomColBut("Random Color Button"));
	}
	 public static void
	  run(final RandomColorButton button1, final int width, final int height) {
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	    	  button1.setTitle(button1.getClass().getSimpleName());
	    	  button1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	  button1.setSize(width, height);
	    	  button1.setVisible(true);
	      }
	    });
	  }
	 public static void main(String[] args) {
		 run(new RandomColorButton(),300,150);
	 }
}
