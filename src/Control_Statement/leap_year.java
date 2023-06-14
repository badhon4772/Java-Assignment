package Control_Statement;

import java.util.Scanner;

public class leap_year {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Scanner scan;
		scan=new Scanner(System.in);         //Nazmul Huda Badhon(221-15-4772)
		
		System.out.print("Enter year: ");
		x=scan.nextInt();
		
		if((x%4==0 && x%100!=0)||x%400==0) {
			System.out.println("Leap Year");
		}
		else 
			System.out.println("Not Leap Year");

	}

}
