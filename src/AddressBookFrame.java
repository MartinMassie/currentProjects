import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class AddressBookFrame extends JFrame implements ActionListener {
	
	private AddressBookModel addressBooks;
	private JMenuBar topMenu;
	private JMenu addressMenu, buddyMenu;
	private JMenuItem addAddress, saveAddress, addBuddy, removeBuddy, editBuddy;
	private GraphicalAddressBookView abv;
	private GraphicalBuddiesView bv;
	private BuddyInfo currentBuddy;
	
	//static JTextField books;
	//static JTextField buddies;	
	
	//JFrame addressFrame;
	
	

	public AddressBookFrame(AddressBookModel ab)
	{
		super("Address Books");	
		addressBooks = ab;
		setLayout(new BorderLayout());
		
		
		
		//Content init
		add(abv = new GraphicalAddressBookView(ab), BorderLayout.WEST);
		//abv.setBounds(abv.getX(), abv.getY(), 300, getHeight());
		
		add(bv = new GraphicalBuddiesView(), BorderLayout.EAST);
		//listSelectionListeners    bv.setModel(((AddressBook)abv.getSelectedValue()).getBuddies());
		abv.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent arg0) 
			{
				bv.setModel(	((AddressBook)(		((GraphicalAddressBookView)arg0.getSource())	.getSelectedValue()))	.getBuddies());				
			}
		});
		bv.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent arg0) 
			{
				currentBuddy = (BuddyInfo) bv.getSelectedValue();				
			}
		});
		
		
		
		//Menu init
		setJMenuBar(topMenu = new JMenuBar());
		topMenu.add(addressMenu = new JMenu("Address Book"));
		topMenu.add(buddyMenu = new JMenu("Buddy Information"));
		addressMenu.add(addAddress = new JMenuItem("Add")).addActionListener(this);
		addressMenu.add(saveAddress = new JMenuItem("Save")).addActionListener(this);
		buddyMenu.add(addBuddy = new JMenuItem("Add")).addActionListener(this);
		buddyMenu.add(removeBuddy = new JMenuItem("Remove")).addActionListener(this);
		buddyMenu.add(editBuddy = new JMenuItem("Edit")).addActionListener(this);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		AddressBookModel addressBook = new AddressBookModel();
		AddressBookFrame frame = new AddressBookFrame(addressBook); 
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		

	}








	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource().equals(addAddress))
		{
			addressBooks.addElement(new AddressBook(JOptionPane.showInputDialog("Name your new address book", "New address book") + ""));
		}
		else if(arg0.getSource().equals(addBuddy))
		{
			((AddressBook)abv.getSelectedValue()).addBuddy(new BuddyInfo(JOptionPane.showInputDialog("Name your new buddy", "Name") + "", JOptionPane.showInputDialog("What's your new buddy's address?", "123 Home Ln") + "", JOptionPane.showInputDialog("What's your new buddy's phone number?", "123 456 7890") + ""));
		}
		else if(arg0.getSource().equals(removeBuddy))
		{
			((AddressBook)abv.getSelectedValue()).removeBuddy(currentBuddy);
		}
		else if(arg0.getSource().equals(editBuddy))
		{
			currentBuddy.setName(JOptionPane.showInputDialog("Change your buddy's name", currentBuddy.getName()) + "");
			currentBuddy.setHomeAddress(JOptionPane.showInputDialog("Change your buddy's address", currentBuddy.getHomeAddress()) + "");
			currentBuddy.setPhoneNumber(JOptionPane.showInputDialog("Change your buddy's phone number", currentBuddy.getPhoneNumber()) + "");			
		}
		
		
	}


}
