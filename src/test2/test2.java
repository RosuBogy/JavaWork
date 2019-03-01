package test2;

import java.util.Scanner;

public class test2 {
	
	
	public static void  main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("O expresie: ");
		String s = scanner.nextLine();
		System.out.println(s);
		int numar1 =0;
		int numar2 =0 ;
		
		if (s.contains(" "))
		{
			System.out.println("No spaces allowed!");
		}else if (s.contains("+"))
		{
			String[] operanzi = s.split("\\+");
			numar1 = Integer.parseInt(operanzi[0]);
			numar2 = Integer.parseInt(operanzi[1]);
			System.out.println(numar1+numar2);		
		} else if (s.contains("-"))
		{
			String[] operanzi = s.split("-");
			numar1 = Integer.parseInt(operanzi[0]);
			numar2 = Integer.parseInt(operanzi[1]);
			System.out.println(numar1-numar2);
		}else
		{
			System.out.println("No valid operator found!");
		}		
		/*char operator =s.charAt(1);
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
		}*/
		scanner.close();
	}

}
