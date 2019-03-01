package tutoriale;

public class EA2 {
	
	public static int reverse(int n)
	{
		int result=0;
		
		while(n>0)
		{
			int cifra = n % 10;
			result = result *10 + cifra;
			n/=10;
		}
		return result;
	}
  
	public static boolean isPalindrome(int n)
	{
		return n == reverse(n);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(1256));
	}

	}

