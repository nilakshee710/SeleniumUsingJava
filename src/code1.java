import java.util.Scanner;

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get number of hours worked 
		System.out.println("Enter number of hours:");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		//Get pay rate
		System.out.println("Enter Payrate:");
		//Scanner scanner = new Scanner(System.in);
		Double rate = scanner.nextDouble();
		//Display result 
		scanner.close();
		System.out.println("Total wages are:");
		System.out.println(hours * rate);
	}

}
