package com.bridgelabz.fellowship.Utility;

public class Utility {
	
	public static int dayOfWeek(int day,int month,int year) {
		int d=day;
		int m=month;
		int y=year;
		
		int Yo=y-(14-m)/12;
		int x=Yo+Yo/4-Yo/100+Yo/400;
		int Mo=m+12*((14-m)/12)-2;
		int Do=(d+x+(31*Mo/12))%7;
		
		return Do;
	}
		
	public static void main(String[] args) {
	
	}

}
