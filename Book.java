package TestMehtods;

public class Book {
	String b_name,b_author,b_pub;
	int b_coast,b_pages;
	
//create a non static method
	// store details of book
	void setbookDetails()
	{
		b_name="Java";
		b_author="James Gosling";
		b_pub="Duro";
		b_coast=390;
		b_pages=678;
		
	}
	void GetBookDetails()
	{
		System.out.println("Book Name" + b_name);
		System.out.println("Book Author" + b_author);
		System.out.println("Book Publication" + b_pub);
		System.out.println("Book Price" + b_coast);
		System.out.println("Book Pages" + b_pages);
		System.out.println("--------------------------------------------------------");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create object of book class to access methods of book
		Book book1=new Book();
		Book book2=new Book();
		Book book3=new Book();
		Book book4=new Book();
		Book book5=new Book();
		
		//set book details
		book1.setbookDetails();
		book2.setbookDetails();
		book3.setbookDetails();
		book4.setbookDetails();
		book5.setbookDetails();
		
		//print book details
		book1.GetBookDetails();
		book2.GetBookDetails();
		book3.GetBookDetails();
		book4.GetBookDetails();
		book5.GetBookDetails();
	}

}
