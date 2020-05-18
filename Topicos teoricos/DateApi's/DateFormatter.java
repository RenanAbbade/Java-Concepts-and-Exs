

import java.lang.Math; 
import static java.time.temporal.ChronoUnit.*;


public class HelloWorld
{
  
  public static void main(String[] args)
  {
	//Date Formatter
    
    String dateFormat = "MMMM d, yyyy";
    LocalDate aDate = null;
    
    boolean validStr = false;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
    
    aDate = LocalDate.parse(dateEntered, formatter);
    
    Period between;
    
    if(aDate.isBefore(LocalDate.now()){
      between = Period.between(aDate, LocalDate.now());
    }else{
      between = Period.between(LocalDate.now(), aDate);
    }
       
    int years = between.getYears();
    int month = between.getMonths();
    int days = between.getDays();
}


