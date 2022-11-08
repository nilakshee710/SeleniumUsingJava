package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list {

	public static List<String> createList(String prefix, int numItems) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < numItems; i++) {
			list.add(String.format("%s%d", prefix, i+1));
		}
		return list;
	}
	
	public static <T> void printCollection(Collection<T> c) {
		c.forEach(item -> System.out.println(item));
	}
	
	public static <T> Set<T> collectionToSet(Collection<T> c) {
		Set<T> set = new HashSet<>();
		set.addAll(c);
		return set;
	}
	
	public static <T> List<T> collectionToList(Collection<T> c) {
		List<T> list = new ArrayList<>();
		list.addAll(c);
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listA = createList("a", 5);
		System.out.println("Elements in listA are :-");
		printCollection(listA);

		List<String> listB = createList("b", 5);
		System.out.println("Elements in listB are :-");
		printCollection(listB);
		
		String[] commonItems = new String[] {"both1", "both2"};
		for (int i = 0; i < commonItems.length; i++) {
			listA.add(commonItems[i]);
			listB.add(commonItems[i]);
		}
		System.out.println("Elements in listA are :-");
		printCollection(listA);
		System.out.println("Elements in listB are :-");
		printCollection(listB);
		
		Set<String> setA = collectionToSet(listA);
		Set<String> setB = collectionToSet(listB);
		setA.retainAll(setB);
		
		System.out.println("Intersection of the two sets is :-");
		printCollection(setA);
		
		List<String> commonItemsList = collectionToList(setA);
		System.out.println("Elements in commonItemsList are :-");
		printCollection(commonItemsList);
		
	}
}

