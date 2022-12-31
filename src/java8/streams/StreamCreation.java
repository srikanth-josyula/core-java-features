package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreation{
	public static void main(String[] args) {

		// creation from array
		String[] strArry = new String[] {"Google","Apple","Microsoft"};
		Stream<String> strStream = Arrays.stream(strArry);
		strStream.forEach(p -> System.out.print(p+", "));
		Stream<String> streamOfArrayPart = Arrays.stream(strArry, 1, 3);
		streamOfArrayPart.forEach(p -> System.out.print(p+", "));
		
		// creation from collection
		List<String> sampleList = new ArrayList<>();
		sampleList.add("Google");
		sampleList.add("Apple");
		sampleList.add("Microsoft");
		
		Stream<String> collectionStream = sampleList.stream();
		collectionStream.forEach(p -> System.out.print(p+", "));
		
		//From a List of elements
		Stream<String> strlistStream = Stream.of("Google","Apple","Microsoft");
		strlistStream.forEach(p -> System.out.print(p+", "));
		
		//using generate function
		Stream<Integer> stream = Stream.generate(() ->  new Random().nextInt(10));
		stream.forEach(p -> System.out.print(p+", "));
		
		//using builder
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		streamBuilder.forEach(p -> System.out.print(p+", "));
	}

}
