package SDA;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,23,24,76};
		int size=array.length;
		System.out.println("size of array is "+size);
		System.out.println("----------------------------------------");
		
		System.out.println("Before swap");
		for (int i : array) 
		{
			System.out.println(i);
		}
		//swap 0 and three
		int j = array[0];
		array[0] = array[3];
		array[3] = j;
		
		System.out.println("after swap");
		for (int i : array) 
		{
			System.out.println(i);
		}
//add array(1) and (2)
		int sum=array[1]+array[2];
		System.out.println("addition is "+sum);
	}

}
