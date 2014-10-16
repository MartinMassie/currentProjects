
public class BuddyInfo 
{
	private String name;
	private String homeAddress;
	private String phoneNumber;
	public BuddyInfo(String name, String homeAddress, String phoneNumber)
	{
		super();
		this.name = name;
		this.homeAddress = homeAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString()
	{
		return "Name: " + name + "\t\t\t" + " Number: " + phoneNumber;
	}
	

}
