import java.util.ArrayList;

import javax.swing.JMenuBar;


public class BuddyMenu extends JMenuBar
{
	AddressBookMenu bookMenu;
	BuddyInfoMenu infoMenu;
	
	public BuddyMenu(AddressBookFrame frame)
	{
		super();
		add(bookMenu = new AddressBookMenu(frame));
		add(infoMenu = new BuddyInfoMenu(frame));		
		infoMenu.setEnabled(false);
		
	}

}
