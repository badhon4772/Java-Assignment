package Control_Statement;

import java.util.Scanner;

public class even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner scan;
		scan=new Scanner(System.in);
		
		System.out.print("Enter a number: "); //Nazmul Huda Badhon(221-15-4772)
		x=scan.nextInt();
		
		if(x!=0) {
		
		if(x%2==0) {
			System.out.println("Even!");
		}
		else if(x%2!=0) {
			System.out.println("Odd!");
		}
		}
		else
			System.out.println("Error!");

	}

}

