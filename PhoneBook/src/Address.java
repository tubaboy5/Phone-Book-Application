
public class Address
{
	public Address(String streetAddress, String cityAddress, String stateAddress, String zipCodeAddress) 
	{
		super();
		this.streetAddress = streetAddress;
		this.cityAddress = cityAddress;
		this.stateAddress = stateAddress;
		this.zipCodeAddress = zipCodeAddress;
	}

	public Address()
	{}
	
	private String streetAddress;
	private String cityAddress;
	private String stateAddress;
	private String zipCodeAddress;
	
	public String getStreetAddress() 
	{
		return streetAddress;
	}
	
	public void setStreetAddress(String streetAddress) 
	{
		this.streetAddress = streetAddress;
	}
	
	public String getCityAddress() 
	{
		return cityAddress;
	}
	
	public void setCityAddress(String cityAddress) 
	{
		this.cityAddress = cityAddress;
	}
	
	public String getStateAddress() 
	{
		return stateAddress;
	}
	
	public void setStateAddress(String stateAddress) 
	{
		this.stateAddress = stateAddress;
	}
	
	public String getZipCodeAddress() 
	{
		return zipCodeAddress;
	}
	
	public void setZipCodeAddress(String zipCodeAddress) 
	{
		this.zipCodeAddress = zipCodeAddress;
	}

	@Override
	public String toString() 
	{
		return "Address [streetAddress=" + streetAddress + ", cityAddress=" + cityAddress + ", stateAddress="
				+ stateAddress + ", zipCodeAddress=" + zipCodeAddress + "]";
	}
	
	public void printData() 
	 {
	        System.out.println( "Contact Address: " + streetAddress);
	        System.out.println( "                 " + cityAddress +"  " +stateAddress +", " +zipCodeAddress);
	        System.out.println();
	}
}

