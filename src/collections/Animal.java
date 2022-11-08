package collections;

public interface Animal{
	public void makeSound();
	public default void eat(){
		System.out.println("eating... ");
	}
	

}
