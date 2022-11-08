package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtil {
	
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
}
