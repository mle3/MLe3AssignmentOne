package edu.nvcc.customerdatabase;
public class Customer 
{
	private String name;
	private String accountNumber;
	private String email;
	private String phone;
	private Address address;
	
	private static int count=0;
	//instance variables
	public Customer(String name, String accountNumber, String email, String phone, Address address)
	{
		this.setName(name);
		this.setAccountNumber(accountNumber);
		this.setEmail(email);
		this.setPhone(phone);
		this.setAddress(address);
		setCount(getCount() + 1);
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static int getCount() 
	{
		return count;
	}
	public static void setCount(int count)
	{
		Customer.count = count;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() 
	{
		return "\r\n"+
				"\tCustomer Information"+"\r\n"+
				"Customer: "+name+"\r\n"+
				"Account #: "+accountNumber+"\r\n"+
				"Email: "+email+"\r\n"+
				"Phone: "+phone+"\r\n"+
				"Address: "+address;
	}
	
}
