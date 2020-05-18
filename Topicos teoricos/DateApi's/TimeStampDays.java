

import java.lang.Math; 
import static java.time.temporal.ChronoUnit.*;


public class HelloWorld
{
  
  public static void main(String[] args)
  {
	//DateTime across Time Zones
    
    LocalDate christmas = LocalDate.of(2014,DECEMBER,25);
    
    long days = DAYS.between(LocalDate.now(), christmas);
    
    System.out.println("We have: "+days+"til Christmas");
 
  }
}


