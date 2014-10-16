

import javax.swing.DefaultListModel;
import javax.swing.JList;


public class GraphicalAddressBookView extends JList 
{
	public GraphicalAddressBookView(AddressBookModel addressBook)
	{
		super(addressBook);
		setModel(addressBook);
		
	}

}
