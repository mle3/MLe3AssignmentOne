package edu.nvcc.customerdatabase;

public class CustDataDemo {

	public static void main(String[] args) 
	{
		// demoprogram
		Address dudeAddress= new Address("123", "Sycamore St", "Faifax", "VA", "22031");
		Customer dude= new Customer("Martin", "0123456", "hello@yahoo.com", "7039119112", dudeAddress);
		Date dudeCardDate=new Date(1, 0, 14);
		Payment dudePayment= new Payment("0123456789123456", dudeCardDate, "456", "Visa", dudeAddress);
		Date newTrans = new Date(9, 18, 13);
		Transaction dudeTrans = new Transaction("000001", newTrans, "Best Buy", "Beats Headphones", 310.26, dudePayment);
		
		
		System.out.println(dude.toString());
		System.out.println(dudeTrans.toString());
		System.out.println(dudePayment.toString());
		
	}

}
