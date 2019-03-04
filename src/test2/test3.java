package test2;


import java.util.Scanner;

public class test3 {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("O expresie: ");
	String s = scanner.nextLine();
	
	
	if (s.contains(" "))
	{
		System.out.println("No spaces allowed!");
	} else if ( s.contains("*") && s.contains("+"))
	{
		String[] operanzi = s.split("(?=[+*])|(?<=[+*])");
		int rezultat = Integer.parseInt(operanzi[0]);
		for(int i=1;i<operanzi.length;i+=2)
		{	
			   String op = operanzi[i];
			   int numar = Integer.parseInt(operanzi[i+1]);
			   System.out.println(numar);
			   
			   switch(op)
			   {
			   case "*":
				   rezultat*=numar;
				   break;
			   case "+":
				   rezultat+=numar;
				   break;
			   }
			   
		    }
		System.out.println(rezultat);
		}
		
		else
	{
		System.out.println("No valid operator found!");
	}	
}
}
