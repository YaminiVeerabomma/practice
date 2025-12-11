package Arrays;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seats= {3,1,5};
		int[] students= {2,7,4};
		int count1=0;
		int count2=0;
		for(int i=0;i<seats.length;i++) {
			count1=count1+seats[i];
		}
		System.out.println(count1);
		for(int j=0;j<students.length;j++) {
			count2=count2+students[j];
		}
		System.out.println(count2);
		int ans=count1-count2;
		System.out.println("ans :"+ans );
	}

}
