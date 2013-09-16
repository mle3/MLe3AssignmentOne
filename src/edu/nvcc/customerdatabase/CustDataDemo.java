package edu.nvcc.customerdatabase;

public class CustDataDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Address dudeAddress= new Address("123", "Sycamore St", "Faifax", "VA", "22031");
		Customer dude= new Customer("Martin", "0123456", "hello@yahoo.com", "7039119112", dudeAddress);
		Payment dudePayment= new Payment("0123456789123456", null, "456", "Visa", dudeAddress);
		Date dudeCardDate=new Date(1, 0, 14);
		dudePayment.setExpDate(dudeCardDate);
		System.out.println(dude.toString());

		System.out.println(dudePayment.toString());
		
	}

}
