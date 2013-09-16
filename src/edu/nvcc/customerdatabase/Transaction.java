package edu.nvcc.customerdatabase;

import java.math.BigDecimal;

public class Transaction {
	private String transId;
	private Date date;
	private String vendor, description;
	private BigDecimal amount;
	private Payment paymentType;
	
	public Transaction (String transId, Date date, String vendor, String desc, BigDecimal amount, String paymentType){
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPaymentType() {
		return this.paymentType.getType();
	}

	public void setPaymentType(String paymentType) {
		this.paymentType.setType(paymentType);
	}

	public String toString(){
		return "Transaction ID: "+transId+"\r\n"+
				"Date: "+date.toString()+"\r\n"+
				"Vendor: "+vendor+"\r\n"+
				"Description of Goods: "+description+"\r\n"+
				"Amount: $"+amount+"\r\n"+
				"Payment Type: "+this.paymentType.getType();
	}
	
}
