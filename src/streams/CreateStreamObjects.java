package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> myStream = Stream.of("p","qq","rrr");
		myStream.forEach(System.out::println);
		
		System.out.println("\n");
		
		Collection<String> collection = Arrays.asList("abc","pqr","xyz");
		Stream<String> myStream1=collection.stream();
		myStream1.forEach(System.out::println);
		
		System.out.println("\n");
		
		List<String> list = Arrays.asList("kk","ab","jj");
		Stream<String> myStream2=list.stream();
		myStream2.forEach(System.out::println);
		
		Set<String> set = new HashSet<>(list);
		Stream<String> myStream3=list.stream();
		myStream3.forEach(System.out::println);
		
	}

}

