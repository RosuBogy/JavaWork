package tutoriale;

public class Factorial {
	
	public static int fac(int n)
	{
		int result =1;
		
		if(n==0 || n==1)
		{
			return result;
		}
		
		return result = fac(n-1)*n;
	}
	
	public static void main(String[] args) {
		
		System.out.println(fac(4));
	}

}
