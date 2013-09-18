package edu.nvcc.customerdatabase;



public class Transaction {
	private String transId;
	private Date date;
	private String vendor, description;
	private double amount;
	private Payment paymentType;
	//instance variables
	public Transaction (String transId, Date date, String vendor, String desc, double amount, Payment paymentType){
		this.setTransId(transId);
		this.setDate(date);
		this.setVendor(vendor);
		this.setDescription(desc);
		this.setAmount(amount);
		this.setPaymentType(paymentType);
		
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getDate() {
		return date.toString();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Payment getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(Payment paymentType) {
		this.paymentType=paymentType;
	}

	public String toString(){
		return "\r\n"+
				"\tTransaction Details"+"\r\n"+
				"Transaction ID: "+transId+"\r\n"+
				"Date: "+date.toString()+"\r\n"+
				"Vendor: "+vendor+"\r\n"+
				"Description of Goods: "+description+"\r\n"+
				"Amount: $"+amount+"\r\n"+
				"Payment Type: "+this.paymentType.getType();
	}
	
}
