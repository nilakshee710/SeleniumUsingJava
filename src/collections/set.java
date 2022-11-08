package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set {

	
	public static List<Integer> createList() {
		List<Integer> list = new ArrayList<>();
		// add some unique elements.
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);		
		// add some duplicate elements.
		list.add(4);
		list.add(4);
		return list;
	}
	public static <T> void printCollection(Collection<T> c) {
		c.forEach(item -> System.out.println(item));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listA = createList();
		System.out.println("Elements in listA are :-");
		printCollection(listA);
		

		System.out.println("Elements using iterator in listA are :-");
		var i = listA.iterator();
		while(i.hasNext()) {
			System.out.format(i.next()+"\t");
		}
		
		Set<Integer> setA = new HashSet<>();
		// Note that Set is a unique collection. Although we added same element multiple times, set will only store the item once.
		setA.addAll(listA);
		System.out.println("\nElements in setA are :-");
		printCollection(setA);
		
		
	}

}
