
public class Book {
	private String author;
	private String[] chapterNames=new String[50];
	public boolean compare=false;
	public Book()
	{
		
	}
	public void set()
	{
		author="Mamoon";
		chapterNames[0]="a";
                chapterNames[0]="B";
	}
	public Book(String a,String[] cn)
	{
		author=a;
		cn=chapterNames;
	}
public Book compareBooks (Book x,Book z)
{
	if (x.author.equalsIgnoreCase(z.author))
	{
	compare=true;	
	}
	Book v=new Book();
	return v;
}
public Book comparech (Book x,Book z)
{
	if (x.chapterNames.length>z.chapterNames.length)
	{
		System.out.println("Author of Book With Largest Chapters is: "+ x.author);
		return x;
	}
	else
	{

		System.out.println("Author of Book With Largest Chapters is: "+ z.author);
	
		return z;
	}
	}

}
