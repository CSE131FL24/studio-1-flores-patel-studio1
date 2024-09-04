package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input year: ");
		int givenYear = in.nextInt();
		boolean isLeapYear = (givenYear % 4 == 0) && !(givenYear % 100 == 0) || (givenYear % 400 == 0);
		
		System.out.println(isLeapYear);

	}

}
