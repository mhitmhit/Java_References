package notes_1;

import java.util.ArrayList;
import java.util.Arrays;

public class playground_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {25, -1};
		numbers[0] = 11;
		numbers[1] = -1;
		System.out.println(numbers[0]);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("ali");
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		System.out.println(nums.get(0));
		
		// importing and using Arrays Class on my example arrays
		Arrays.toString(numbers);
		
	}

}
