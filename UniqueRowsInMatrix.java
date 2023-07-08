package Integer1D;

import java.util.HashSet;
import java.util.Set;

public class UniqueRowsInMatrix {

	private static boolean unique(int[][] matrix) {
		Set<Integer> set = new HashSet<>();
		for(int i =0;i<matrix.length;i++) {
			for(int j = 0;j<matrix[0].length;j++) {
				if(set.contains(matrix[i][j]))return false;
				else set.add(matrix[i][j]);
			}
			set.clear();
		}
		return true;
	}
	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3},{3,4,5},{2,1,4}
		};
		System.out.println(unique(matrix)==true?"Unique":"Not Unique");
	}

}
