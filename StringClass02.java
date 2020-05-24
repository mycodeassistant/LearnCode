package StringClass;
import java.util.Scanner;

public class StringClass02 {

	public static void main(String[] args) {
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter any line ");
		String str=sr.nextLine();
      
		for(int i=0;i<str.length();i++)
		{
			//get ith char in string
			char c=str.charAt(i);
			if(c==32)
			{
				System.out.print("<space>");
			}
			else {
				System.out.print(c);
			}
		}
	}

}
