package collections;

import java.util.function.Function;

public class functiondemo implements Function<String, Integer>{
	
	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
}

public class functionImpl{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> myfunction = (String s)->s.length();
		System.out.println(myfunction.apply("Gayatri"));

	}

	

}
