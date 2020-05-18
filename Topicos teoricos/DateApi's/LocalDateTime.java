public class DataTimeZone{

  public static void main(String[]args){
  
  

  LocalDateTime meeting, flight, courseStart, courseEnd;

  Meeting = LocalDateTime.of(2014, MARCH, 21,13,30);

  LocalDate fligthDate = LocalDate.of(2014, MARCH, 31);
  LocalDate flightTime = LocalTime.of(21,45);
  Flight = LocalDateTime.of(flightDate.flightTime);
  
  //Calcular o começo o final de um curso por tempo consumido
  
  courseStart = LocalDateTime.of(2014, MARCH, 24,9,00);
  courseEnd = courseStart.plusDays(4).plusHours(8);
  System.out.println("CourseStarts: ˜+courseStart);
  System.out.println("courseEnd: ˜+courseEnd);
  
  long courseHrs = (courseEnd.getHour() - courseStart.getHour()) * (courseStart.until(courseEnd, DAYS) +1);;
  
  System.out.print("Course is: ˜+ courseHrs + "hours long");
  
  
  }
}
