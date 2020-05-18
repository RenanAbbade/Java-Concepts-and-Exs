package javaCourse;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now, bDate, nowPlusMonth, nextTues;
		
		now = LocalDate.now();
		System.out.println("now "+ now);
		
		bDate = LocalDate.of(1995, 5, 23);
		
		System.out.println("Java BDAY: "+bDate);
		System.out.println("Java BDAY: "+bDate.isBefore(now));
		System.out.println("leap year(ano bissexto): "+bDate.isLeapYear());
		System.out.println("day of week: "+bDate.getDayOfWeek());
		
		nowPlusMonth = now.plusMonths(1);
		
		System.out.println(nowPlusMonth);
	}

}
