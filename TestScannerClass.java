package ScannerClass;
import java.util.Scanner;

public class TestScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create obj of Scanner class
				Scanner sc = new Scanner(System.in);
				
				
				System.out.println("enter int value ");
				int intValue = sc.nextInt();
				
				System.out.println(intValue);
				
				
				System.out.println("enter float value ");
				float floatValue = sc.nextFloat();
				
				System.out.println(floatValue);
				
				System.out.println("Enter Char value ");
			    String stringval=sc.next();
			    System.out.println(stringval);
			    System.out.println(stringval.length());

	}

}
