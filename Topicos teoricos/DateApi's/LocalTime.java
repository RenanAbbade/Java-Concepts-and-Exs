package javaCourse;

import java.time.LocalDate;
import java.time.LocalTime;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Api pega a hora exata, e realiza calculos
		LocalTime now, nowPlus, nowHrsMins, lunch, bedtime;
		
		now = LocalTime.now();
		
		System.out.println(now);
		
		nowPlus = now.plusHours(1).plusMinutes(15);
		System.out.println(nowPlus);
		
		lunch = LocalTime.of(12, 30);
		
		System.out.println("Is lunch in my future? "+lunch.isAfter(now));
		
		
	}
}

