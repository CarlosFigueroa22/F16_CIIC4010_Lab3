import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Lab3Exercises 
{
	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame("Carlos Jose Figueroa Vazquez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screen.getWidth();
		int height = (int)screen.getHeight();
		
		myFrame.setLocation((width/2-100), (height/2-100));
		
	
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
		
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
	}
}