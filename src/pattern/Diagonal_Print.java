package pattern;
import java.util.List;
import java.util.*;

public class Diagonal_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,
			 9}};
		int n=arr.length;
		//System.out.println(n);
		int m=arr[0].length;
		//System.out.println(m);
		for(int d=0;d<n+m-1;d++) {
			List<Integer> Diagonal=new ArrayList<Integer>();
			int row = d < m ? 0 : d - m + 1;
			int col = d < m ? d : m - 1;
			while (row < n && col >= 0) {
			    Diagonal.add(arr[row][col]);
			    row++;
			    col--;
			}
			System.out.println(Diagonal);
		}

	}

} 
