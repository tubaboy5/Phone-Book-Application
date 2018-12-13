
public class Contact 
{

	public Contact(String firstName, String lastName, String address, String telephoneNumber) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}


	public Contact()
	{}

	private String firstName;
	private String lastName;
	private String address;
	private String telephoneNumber;

	
	 public void printData() 
	 {
	        System.out.println( "Contact Name: " + firstName +" " +lastName);
	        System.out.println( "Contact Phone Number: " + telephoneNumber );
	        System.out.println();
	}
	


	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getTelephoneNumber() 
	{
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) 
	{
		this.telephoneNumber = telephoneNumber;
	}

	@Override
	public String toString() 
	{
		return lastName +", " +firstName;	
	}
	
	
/*	
	@Override
	public String toString() 
	{
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", telephoneNumber=" + telephoneNumber + "] \n" ;	
	}
*/	
	
}
