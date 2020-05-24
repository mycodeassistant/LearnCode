package TestMehtods;

public class Book_Part2 {
	String b_name,b_author,b_pub;
	int b_prize,b_pages;
	
//create a non static method
	//store book details
 public void SetBookDetails(String name,String author,String pub,int prize,int pages)
	{
		b_name=name;
		b_author=author;
		b_pub=pub;
		b_prize=prize;
		b_pages=pages;
	}
	// crate get method
public	void GetBookDetails()
	{
		System.out.println("Book Name"+b_name);
		System.out.println("Book Author"+b_author);
		System.out.println("Book Publication"+b_pub);
		System.out.println("Book Prize"+b_prize);
		System.out.println("Book Pages"+b_pages);
		System.out.println(".........................................");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book_Part2 book1=new Book_Part2();
Book_Part2 book2=new Book_Part2();
Book_Part2 book3=new Book_Part2();

book1.SetBookDetails("Yoges", "Jamesh Gosling", "Kanetkar", 579, 908);
book2.SetBookDetails("Java", "Jamee", "puej", 678, 423);
book3.SetBookDetails("GOT"," Vince", "KOioi", 2090, 3103);

//get book details
book1.GetBookDetails();
book2.GetBookDetails();
book3.GetBookDetails();
	}

}
