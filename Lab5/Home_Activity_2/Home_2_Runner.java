
public class Home_2_Runner {

	public static void main(String[] args) {
		Book b=new Book();
		b.set();
		String[] str=new String [15];
		str[0]="ABCD";
		Book b1=new Book("Ali",str);
		Book c=new Book();
		Book c1=new Book();
		c.compareBooks(b, b1);
		if(c.compare)
		{
			System.out.println("author true");
		}
		c1=b.comparech(b, b1);
			}

}
