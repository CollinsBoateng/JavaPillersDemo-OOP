package Review;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public int subtractProductAndSum(int n) {

		List<Integer> arr = new ArrayList<Integer>();
			
		
		while (n > 0) {

			int a = n % 10;
			arr.add(a);
			
			System.out.println(arr);

			n = a;

		}
		
		
		
		return n;
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		obj.subtractProductAndSum(234);
	}

}
