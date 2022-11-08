package Day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import util.CollectionUtil;

public class setExample {

	public static List<Integer> createList(){
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(1);
		mylist.add(6);
		mylist.add(3);
		mylist.add(4);
		return mylist;
				
	}
	
	public void List<Integer> printList(){
		//this..forEach(item -> System.out.println(item));
		 System.out.println("List : " + this.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listA = createList();
		System.out.println("Elements in listA are :-");
	//	CollectionUtil.printCollection(listA);
		listA.printList();
	}

}
