import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class AddressBookMenu extends JMenu implements ActionListener
{
	JMenuItem addAddressBook;
	JMenuItem saveAddressBook;
	
	public AddressBookMenu(AddressBookFrame frame)
	{
		super("Address Book");
		add(addAddressBook = new JMenuItem("Add"));
		addAddressBook.addActionListener(this);
		
		add(saveAddressBook = new JMenuItem("Save"));
		saveAddressBook.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if (arg0.getSource().equals(addAddressBook))
		{
			AddressBookPanel newBook;
			AddressBookFrame.addressBooks.get(AddressBookFrame.addressBooks.size() - 1).add
			(newBook = new AddressBookPanel(new AddressBook("Test")), BorderLayout.CENTER);
			AddressBookFrame.addressBooks.add(newBook);
			//AddressBookFrame.addressBooks.add(new AddressBook("Test"));
			//AddressBookFrame.books.setText(AddressBookFrame.books.getText()+"Test" + "\n");
		}
		else if(arg0.getSource().equals(saveAddressBook))
		{
			
		}
		
	}
}
