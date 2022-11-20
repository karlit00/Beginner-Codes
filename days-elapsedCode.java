//a program that lets you find out the day elapsed after the day a user inputs
import java.util.*;
public class Number3 {
	public static void main(String args[]) {
		
		Scanner future = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int day = future.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int dayselapsed = future.nextInt();
		int futureday;
		
		futureday = (day + dayselapsed) % 7;
		
		System.out.print("Today is ");
		switch(day) {
		case 0: System.out.print("Sunday"); break;
		case 1: System.out.print("Monday"); break;
		case 2: System.out.print("Tuesday"); break;
		case 3: System.out.print("Wednesday"); break;
		case 4: System.out.print("Thursday"); break;
		case 5: System.out.print("Friday"); break;
		case 6: System.out.print("Saturday"); ;break;
		
		}
		System.out.print(" and the Future day is ");
		
		switch(futureday) {
		case 0: System.out.print("Sunday"); break;
		case 1: System.out.print("Monday"); break;
		case 2: System.out.print("Tuesday"); break;
		case 3: System.out.print("Wednesday"); break;
		case 4: System.out.print("Thursday"); break;
		case 5: System.out.print("Friday"); break;
		case 6: System.out.print("Saturday"); ;break;
		 
		}
		
	}
	
}
