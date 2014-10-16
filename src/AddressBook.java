import javax.swing.DefaultListModel;


public class AddressBook 
{
	String name;
	//HashMap<String, BuddyInfo> buddies;
	DefaultListModel<BuddyInfo> buddies;
	public AddressBook(String name)
	{
		this.name = name;
		buddies = new DefaultListModel<>();
	}
	
	public void addBuddy(BuddyInfo newBuddy)
	{
		buddies.addElement(newBuddy);		
	}
	
	public boolean removeBuddy(BuddyInfo buddy)
	{
		return buddies.removeElement(buddy);		
	}
	
	public DefaultListModel<BuddyInfo> getBuddy(String name)
	{
		return buddies;
	}
	
	public String toString()
	{
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DefaultListModel<BuddyInfo> getBuddies() {
		return buddies;
	}
	
}
//test : eddited from GitHub
