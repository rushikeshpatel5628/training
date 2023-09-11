package array_demo;

public class AdditionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] list1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] list2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		int[][] sum = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = list1[i][j] + list2[i][j]; 
			}
		}
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
