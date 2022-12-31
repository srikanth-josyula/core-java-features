package java8.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratewithoutStreams {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);

		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			sum += num;
		}

		System.out.println(sum);
	}
}
