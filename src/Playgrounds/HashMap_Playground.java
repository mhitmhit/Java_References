package Playgrounds;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class HashMap_Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {4,2,3,2,3,5,5};
		int[] array2 = {3,1,1,6,3,5,5};
		int[] array3 = {1,7,1,7,9,5,5};
		
		Map<Integer, Integer> myMap = new HashMap<>();
		
		System.out.println(returnUniqueNumber(myMap, array1));
		System.out.println(returnUniqueNumber(myMap, array2));
		System.out.println(returnUniqueNumber(myMap, array3));
	}
	
	public static int returnUniqueNumber(Map<Integer, Integer> map, int[] arr) {
		System.out.println("----------------");
		map.clear();
		int result = -1;
		for (int i=0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (Objects.equals(entry.getValue(), 1)) {
				result = entry.getKey();
			}
		}
		return result;
	}

}
