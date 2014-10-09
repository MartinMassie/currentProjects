import java.util.HashMap;


public class AddressBook 
{
	String name;
	HashMap<String, BuddyInfo> buddies;
	public AddressBook(String name)
	{
		this.name = name;
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
}
//test : eddited from GitHub
