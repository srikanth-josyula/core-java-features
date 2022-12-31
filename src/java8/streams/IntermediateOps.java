package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		Stream<Integer> numStream = myList.stream();
		
		Stream<Integer> evenNums = numStream.filter(p -> p % 2 == 0);
		System.out.print("Even Nums are ");
		evenNums.forEach(p -> System.out.print(p+" "));
	}

}
