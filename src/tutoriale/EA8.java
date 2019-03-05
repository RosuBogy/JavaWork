package tutoriale;

public class EA8 {
	
	public static boolean contains(int[] a, int[] b)
	{ 
		int counter = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(counter == b.length)
			{
				counter =0;
			}
			if (b[counter] == a[i])
			{
				return true;
			}
			counter ++;
		}
		
		return false;
	}
	
   public static void main(String[] args) {
	   contains(new int[]{1, 2, 3, 4, 2, 1, 3, 4}, new int[] {2, 3, 4});
}
}
