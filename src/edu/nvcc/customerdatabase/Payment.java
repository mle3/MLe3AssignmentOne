package edu.nvcc.customerdatabase;

public class Payment {
	private String credCard;
	private Date expDate;
	private String secCode, type;
	private Address billing;
	private static int count=0;
	//instance variables
	public Payment(String credCard, Date expDate, String secCode, String type, Address billing){
		this.setCredCard(credCard);
		this.setExpDate(expDate);
		this.setSecCode(secCode);
		this.setType(type);
		this.setBilling(billing);
		setCount(count+1);
	}

	public String getCredCard() {
		return "****-****-****-"+credCard.substring(12);
	}

	public void setCredCard(String credCard) {
		this.credCard = credCard;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getSecCode() {
		return secCode;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBilling() {
		return billing.toString();
	}

	public void setBilling(Address billing) {
		this.billing = billing;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Payment.count = count;
	}
	public String toString(){
		return "\r\n"+
				"\tCustomer Payment Information"+"\r\n"+
				"Credit Card: "+this.getCredCard()+"\r\n"+
				"Expiration Date: "+expDate+"\r\n"+
				"Security Code: "+secCode+"\r\n"+
				"Credit Card Type: "+type+"\r\n"+
				"Billing Address: "+this.billing.toString();
	}

}
