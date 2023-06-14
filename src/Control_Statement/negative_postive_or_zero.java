package Control_Statement;

import java.util.Scanner;

public class negative_postive_or_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter a number: ");   //Nazmul Huda Badhon (221-15-4772)
		
		Scanner sc;
		sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}

	}

}
