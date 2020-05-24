package TestRandom;
import java.util.Random;
public class Random02 {

	public static void main(String[] args) {

	//create an object of Random class	
      Random r=new Random();
      int ranValue=r.nextInt(500);
      System.out.println(ranValue);
	}

}
