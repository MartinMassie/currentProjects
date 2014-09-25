import java.util.HashMap;


public class AddressBook 
{
	HashMap<String, BuddyInfo> buddies;
	public AddressBook()
	{
		buddies = new HashMap<>();
	}
	
	public void addBuddy(BuddyInfo newBuddy)
	{
		buddies.put(newBuddy.getName(), newBuddy);		
	}
	
	public BuddyInfo removeBuddy(String name)
	{
		return buddies.remove(name);		
	}
	public BuddyInfo getBuddy(String name)
	{
		return buddies.get(name);
	}
	public static void main(String[] args) 
	{
		System.out.println("Address Book");
		BuddyInfo buddy1 = new BuddyInfo("Peter S", "Kuait", "6131234567");
		AddressBook book1 = new AddressBook();
		book1.addBuddy(buddy1);
		book1.removeBuddy("Peter S");
	}
}
//test : eddited from GitHub
