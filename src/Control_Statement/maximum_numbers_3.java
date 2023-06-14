package Control_Statement;

import java.util.Scanner;

public class maximum_numbers_3 {

	public static void main(String[] args) {    
		                                      //Nazmul Huda Badhon(221-15-4772)
		int a,b,c,max;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		
		System.out.println("Enter second number: ");
		b=sc.nextInt();
		
		System.out.println("Enter third number: ");
		c=sc.nextInt();
		
		max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println("The maximum number is: "+max);

	}

}
