package DDA;

public class TestDDA3 {

	public static void main(String[] args) {
		int row = 2;
		int col = 3;
		int[][] a = new int[row][col]; 
		
		//fetch the data of DDA
		for (int rowNo = 0; rowNo < a.length; rowNo++) 
		{
			for (int cols = 0; cols < a[rowNo].length; cols++) 
			{
				System.out.print(a[rowNo][cols]+" ");
			}
			System.out.println();
		}

	}

}
