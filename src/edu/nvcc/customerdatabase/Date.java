package edu.nvcc.customerdatabase;

public class Date {
	private int month, day, year;
	private static int count=0;
	
	public Date(int month, int day, int year){
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
		setCount(count+1);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Date.count = count;
	}
	
	public String toString(){
		return month+"/"+day+"/"+year;
	}

}
