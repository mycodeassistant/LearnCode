package DDA;

public class TestDDA2 {

	public static void main(String[] args) {
		
        int[][] a = {{1,2,3},{1,2},{1}}; //row define -> {} 
		
		//fetch the data of DDA
		for (int rowNo = 0; rowNo < a.length; rowNo++) 
		{
			for (int col = 0; col < a[rowNo].length; col++) 
			{
				System.out.print(a[rowNo][col]+" ");
			}
			System.out.println();
		}
	}

}
