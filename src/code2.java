import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get Adjective 
		System.out.println("Enter Adjective:");
		Scanner scanner = new Scanner(System.in);
		String Adjective = scanner.nextLine();
		
		//Get season of year 
		System.out.println("Enter Season:");
		String Season = scanner.nextLine();
		
		//Get number of coffee
		System.out.println("Enter number of hours:");
		int coffeecups = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(String.format("on a %s %s day , I drink a minimum of %d cups of coffee ",Adjective, Season ,coffeecups));
		

	}

}
