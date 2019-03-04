package tutoriale;

public class BA8 {
	
	public static int[] reverse(int[] sir)
	{
		
		if (sir.length == 0)
		{
			return sir;
		}
		
		for(int i=0;i<sir.length / 2;i++)
		{
			int temp = sir[i];
			sir[i] = sir[sir.length-i-1];
			sir[sir.length-i-1] = temp;
			
		}
		
		return sir;
		
	}
	
	public static void main(String[] args) {
		 System.out.println(reverse(new int[]{10}));
	}

}
