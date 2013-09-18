package edu.nvcc.customerdatabase;

public class Address {
	private String houseNum, street, city, state, zip;
	private static int count=0;
	//instance variables
	public Address (String num, String street, String city, String state, String zip){
		this.setHouseNum(num);
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		setCount(getCount() + 1);
	}
	
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Address.count = count;
	}

	public String toString(){
		return "\r\n"+
				"\t"+houseNum+" "+street+"\n"+
				"\t"+city+", "+state+" "+zip;
	}
}
