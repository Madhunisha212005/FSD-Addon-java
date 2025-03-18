package programs;

import java.util.Scanner;

public class personalinfo {
      
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter your moblie no:");
		int mob = obj.nextInt();
		
		System.out.println("enter your name:");
		String name = obj.next();
		
		System.out.println("enter your addr:");
		String addr = obj.next();
		}
}
