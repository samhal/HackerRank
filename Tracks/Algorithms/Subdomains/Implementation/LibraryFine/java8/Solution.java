import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("d M yyyy");
		LocalDate actualDate = LocalDate.parse(in.nextLine(), frmt);
		LocalDate expectedDate = LocalDate.parse(in.nextLine(), frmt);
		int fine;
		if (actualDate.compareTo(expectedDate) < 1) {
			fine = 0;
		} else if (actualDate.getYear() > expectedDate.getYear()) {
			fine = 10000;
		} else if (actualDate.getMonthValue() > expectedDate.getMonthValue()) {
			fine = 500 * (actualDate.getMonthValue() - expectedDate.getMonthValue());
		} else {
			fine = 15 * (actualDate.getDayOfMonth() - expectedDate.getDayOfMonth());
		}
		System.out.println(fine);
	}
}
