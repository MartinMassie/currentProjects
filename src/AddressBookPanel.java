import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class AddressBookPanel extends JPanel
{
	private AddressBook myAddressBook;
	public AddressBookPanel(AddressBook book)
	{
		super();
		myAddressBook = book;
		this.setLayout(new BorderLayout());
		this.add(new JButton(book.name), BorderLayout.NORTH);
	}
	public AddressBook getMyAddressBook() {
		return myAddressBook;
	}
	public void setMyAddressBook(AddressBook myAddressBook) {
		this.myAddressBook = myAddressBook;
	}	
}
