package SDA;
import java.util.Scanner;
public class TestSyntax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int[5];
		Scanner sr=new Scanner(System.in);
		System.out.println("Before Entering Data");
		
		for(int i:array)
		{
		System.out.println(i);	
		}
		System.out.println("--------------------");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter value of Element "+i);
			array[i]=sr.nextInt();
		}
System.out.println("--------------------");
		
		System.out.println("after entering data");
		
		for (int i : array) 
		{
			System.out.println(i);
		}
	}

}
