package StringClass;

public class StringClass01 {

	public static void main(String[] args) {
		
        String s ="hello";
		
		//get the real address of s
		int addressOfS = System.identityHashCode(s);
		
		System.out.println("data using literal ->"+s+" with address "+addressOfS);
		
		
		String s2 = new String("Hello");
		
		String s3 = new String("Hello");
		
		//get the real address of s2
		int addressOfS2 = System.identityHashCode(s2);
		System.out.println("data using new ->"+s2+" with address "+addressOfS2);
		
		//find the real address of Hello
		int realAddressOfS2 = System.identityHashCode(s2.intern());
		System.out.println("data using new ->"+s2+" with the real address "+realAddressOfS2);
		
		
		//get the real address of s2
		int addressOfS3 = System.identityHashCode(s3);
		System.out.println("data using new ->"+s3+" with address "+addressOfS3);
				
		//find the real address of Hello
		int realAddressOfS3 = System.identityHashCode(s3.intern());
		System.out.println("data using new ->"+s3+" with the real address "+realAddressOfS3);
	
	}

}
