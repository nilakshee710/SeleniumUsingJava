import java.util.Scanner;

public class PhoneBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tax =15;
		double callCharge = 0.25;
		double subTotal=0.0,a;	
		
		System.out.println("Enter Plan fee:");
		Scanner scanner = new Scanner(System.in);
		int planFee = scanner.nextInt();
		
		System.out.println("Enter Avg Minutes:");
		int avgMinutes = scanner.nextInt();
		
		a = (planFee + ( callCharge * avgMinutes));
		System.out.println("Base Total :"+a);
		System.out.println("Tax :"+(tax/100));
		subTotal = a*(tax/100);
		System.out.println("Final total : "+(subTotal+a));
		
	}
}