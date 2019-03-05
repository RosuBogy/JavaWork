package tutoriale;

public class EA12 {
	
	public static int[] removePosition(int[] arr, int pos)
	{
		if(pos >=0 && pos<arr.length && arr.length>0)
		{
		int[] arr2 = new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i!=pos)
			{
			arr2[j] = arr[i];
			j++;
			}			
		}
		return arr2;
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(removePosition(new int[] {5, 8, 11, 3, 6},0));	
	}
	
}
