import java.util.HashMap;
import java.util.Map;
//2,7,11,15
public class N_0001_Two_Sum {
	public static void main(String[] args) {
		Map<Integer,Integer>num = new HashMap<>();
		int[] nums = {2,7,11,15};
		int count= 0;
		int target = 18;
		
		for(int i = 0; i <nums.length;i++) {
			for(int t = i+1;t<nums.length;t++) {
				if(nums[t] == target - nums[i]) {
					System.out.println("[" + i +"]" + ",[" + t +"]");
				}
			}
		}
		
	}
}