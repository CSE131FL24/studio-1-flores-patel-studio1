package studio1;
import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int n1 = in.nextInt();
		System.out.println("Enter the next Integer: ");
		int n2 = in.nextInt();
		
		double avg = (n1+n2)/2.0;
		System.out.println("The average is: " + avg);
	}

}
