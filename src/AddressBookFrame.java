import javax.swing.*;
import java.awt.BorderLayout;
import java.util.ArrayList;


public class AddressBookFrame {
	
	static ArrayList<AddressBookPanel> addressBooks;
	//static JTextField books;
	//static JTextField buddies;

	public static void main(String[] args) 
	{
		addressBooks = new ArrayList<>();
		AddressBookFrame frame = new AddressBookFrame(); 

	}
	
	JFrame addressFrame;
	
	
	public AddressBookFrame()
	{
		addressFrame = new JFrame("Address Books");
		addressFrame.setSize(600, 600);
		addressFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addressFrame.setLayout(new BorderLayout());
		
		addressFrame.setJMenuBar(new BuddyMenu(this));
		
		
		AddressBookPanel startBook;
		addressFrame.add(startBook = new AddressBookPanel(new AddressBook("Address Books: ")), BorderLayout.WEST);
		addressBooks.add(startBook);
		//addressFrame.add(, BorderLayout.EAST);
		
		
		
		addressFrame.setVisible(true);
	}


}
