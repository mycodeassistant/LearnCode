package TestRandom;
import java.util.Random;
public class Random03 {

	public static void main(String[] args) {
	
 //create an object of Random class
		Random r=new Random();
		int ranValue=r.nextInt(26)+'A';
		System.out.println((char)ranValue);
	}

}
