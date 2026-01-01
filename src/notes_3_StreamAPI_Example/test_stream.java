package notes_3_StreamAPI_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test_stream {
	// Iterate
	public static void streamIterate(List<City> CityList) {
			// For each receives a Consumer<T> which is expecting an action.
			CityList.stream().forEach((City a) -> { System.out.println(a.getName()); });
	}

	// Filter
	public static void streamFilter(List<City> CityList, String filter) {
			// Filter receives a Predicate<T> as a parameter
			CityList.stream().filter((City a) -> new StringBuilder(a.getName()).indexOf(filter) != -1)
			.forEach((City a) -> { System.out.println(a.getName()); });
	}

	// Max
	public int streamMax(int[] array) throws IllegalArgumentException {
			if(array == null) {
					
					throw new IllegalArgumentException("Can't process a null array.");
			}
			return Arrays.stream(array).max().getAsInt();
	}

	// Average
	public double streamAverage(int[] array) throws IllegalArgumentException {
			if(array == null) {
					
					throw new IllegalArgumentException("Can't process a null array.");
			}
			return Arrays.stream(array).average().getAsDouble();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<City> CityList = new ArrayList<>();
		CityList.add(new City(1,"Juan","Lopez",212));
		CityList.add(new City(2,"Ariel","Gomez",210));
		CityList.add(new City(3,"Peter","Alagna",214));
		CityList.add(new City(4,"Bobbert","Lesley",213));

		/** Iterate **/
		System.out.println("Iterating over all list: ");
		test_stream.streamIterate(CityList);
		System.out.println();

		/** Filter **/
		String filter = "r";
		System.out.println("Iterating over list with filter(" + filter + ")");
		test_stream.streamFilter(CityList, filter);
	}

}
