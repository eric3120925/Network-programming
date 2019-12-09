import java.awt.FlowLayout;
import javax.swing.JFrame; //basic window figure
import javax.swing.JLabel;

public class tuna extends JFrame{
	
	private JLabel item1;
	
	public tuna() {
		super("The title bar"); //Title bar
		setLayout(new FlowLayout());
		
		
		item1 = new JLabel("this is a senetence");
		item1.setToolTipText("This is gona show up on hover");
		add(item1);
	}
}
