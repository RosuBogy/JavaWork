package JaveSesiune;

public class Chapter {
    
	private String name;
	private Chapter[] subChapter = new Chapter[0]; 
	
	public Chapter (String name)
	{
		this.name = name;
	}
	
	public void show() {
		System.out.println(name);
	}
	
	public void addChapters(Chapter[] chapters)
	{
		this.subChapter = chapters;
	}
	
	public void display(String prefix)
	{
		System.out.println(prefix + name);
		for(int i=0;i<subChapter.length;i++)
		{
			subChapter[i].display(prefix + " " + (i + 1) + ".");
			
		}
	}

}
