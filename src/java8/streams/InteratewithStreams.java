package java8.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratewithStreams {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);

		int sum = list.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
	}
}
