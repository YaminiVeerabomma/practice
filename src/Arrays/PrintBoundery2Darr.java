package Arrays;
import java.util.*;

public class PrintBoundery2Darr {
	public List printboundery(int[][] arr){
		List result=new ArrayList();
		int i=0,j=0;
		for(int k=0;k<=arr.length-2;k++) {
			//System.out.println(arr[i][j]);
			result.add(arr[i][j]);
			j++;
		}
		int q=0,r=arr.length-1;
		for(int k=0;k<=arr.length-2;k++) {
			//System.out.println(arr[q][r]);
			result.add(arr[q][r]);
			q++;
		}
		int s=arr.length-1,t=arr.length-1;
		for(int k=0;k<=arr.length-2;k++) {
			//System.out.println(arr[s][t]);
			result.add(arr[s][t]);
			t--;
		}
		int u=arr.length-1,v=0;
		for(int k=0;k<=arr.length-2;k++) {
			//System.out.println(arr[u][v]);
			result.add(arr[u][v]);
			u--;
		}
		
		
		return  result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		PrintBoundery2Darr pba=new PrintBoundery2Darr();
		List output=pba.printboundery(arr);
		System.out.println(output);

		}
	}


