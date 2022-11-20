import java.util.*;
public class Number8 {
	public static void main(String args[]) {
		//Page 70, Act 2.8
		
		Scanner timeread = new Scanner(System.in);
		long totalmillsecs,totalsecs,currentsec,totalmin,currentmin,totalhr,currenthr,offset;
		
		System.out.println("Enter the timezone offset to GMT: ");
		offset = timeread.nextLong();
		
		totalmillsecs = System.currentTimeMillis();
		totalsecs = totalmillsecs/1000;
		currentsec = totalsecs % 60;
		totalmin = totalsecs / 60;
		currentmin = totalmin % 60;
		totalhr = totalmin / 60;
		currenthr = totalhr % 24;
		currenthr = ((totalhr+offset)%24);
		
		System.out.println("Current time is: " + currenthr+":"+currentmin+":"+currentsec);
		
		
	}

}
