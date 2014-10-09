import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;


public class BuddyInfoMenu extends JMenu implements ActionListener
{
	public BuddyInfoMenu(AddressBookFrame frame)
	{		
		super("Buddy Info");
		JButton addBuddy;
		add(addBuddy = new JButton("Add"));
		addBuddy.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
