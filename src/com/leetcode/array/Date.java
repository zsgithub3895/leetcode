package com.leetcode.array;

public class Date {
    private final int month;
    private final int year;
    private final int day;
    public static void main(String[] args) {
    	Common.setALL_PLAY_D2("111");;
    	System.out.println(Common.getALL_PLAY_D2());
		/*Date d = new Date(1,2,3);
		System.out.println(d.toString());
		Date dd = new Date(1,2,3);
		System.out.println(dd.toString());
		System.out.println(d.equals(dd));*/
	}
	public Date(int month, int year, int day) {
		this.month = month;
		this.year = year;
		this.day = day;
	}
	
	@Override
	public String toString() {
		return "Date [month=" + month + ", year=" + year + ", day=" + day + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int getDay() {
		return day;
	}
	
}
