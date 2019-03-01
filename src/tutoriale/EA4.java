package tutoriale;

public class EA4 {
	
	public static int cmmmc(int a, int b)
	{
		int max = Integer.max(a,b);
		
		while(true)
		{
			if(max%a==0 && max%b==0)
			{
				return max;
			}
		}
	}
	}


