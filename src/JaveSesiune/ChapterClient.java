package JaveSesiune;

public class ChapterClient {
	
	public static void main(String[] args) {
		
		ChapterClient carte = new ChapterClient();
		carte.doStuff();
	}
	
	private void doStuff()
	{
		Chapter cuprins = new Chapter("Introducere");
		Chapter first = new Chapter("First");
		Chapter second = new Chapter("Second");
		Chapter third = new Chapter("third");
		Chapter fourth = new Chapter("third");
		
		
		first.addChapters(new Chapter[] {second});
		second.addChapters(new Chapter[] {third,fourth});
		cuprins.addChapters(new Chapter[] {first,second,third});
		
		cuprins.display(" ");
		
				
	}

}
