package Arrays;
import java.util.*;

public class DifferenceOfSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int m=3;
		List nums1=new ArrayList<>();
        List nums2=new ArrayList<>();
        int result=0;
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
          
            if(i%m!=0){
                nums1.add(i);
                sum1=sum1+i;

            }
            else{
                nums2.add(i);
                sum2=sum2+i;
            }
        }
        System.out.println(nums1);
         result=sum1-sum2;
         System.out.println(result);
        

	}

}
