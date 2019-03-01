package test2;

import java.util.Scanner;

public class test2 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("O expresie: ");
		String s = scanner.nextLine();
		System.out.println(s);
		
		char operator =s.charAt(1);
		String numar1 = ""+ s.charAt(0);
		String numar2 = "" + s.charAt(2);
		int x = Integer.parseInt(numar1);
		int y = Integer.parseInt(numar2);
		
		if (operator == '+')
		{
			System.out.println(x+y);
		}else if (operator == '-')
		{
			System.out.println(x-y);
		}
		scanner.close();
	}

}
