package Arrays;
import java.util.*;

public class ThirdMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums= {1,2,3};
		int[] nums= {1,2};
		//int[] nums= {1,1,2,3};
		int ans=0;
		List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!l.contains(nums[i])){
                l.add(nums[i]);
                int resu=nums[i];
                if(l.size()==3){
                 resu=nums[i];
                 
                    
                }
                ans=resu;
            }
           
        }
        System.out.println(ans);

	}

}
