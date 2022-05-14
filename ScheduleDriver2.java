import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ScheduleDriver2 {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
/**
 * perMonth object is instantiated. 02 (day) of any month in the year is set
 * for the activities that happen on 2 of every month. 
 */
		PerMonthSchedule perMonth = new PerMonthSchedule();
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.DAY_OF_MONTH, 02);
		Date date = cal1.getTime();
		perMonth.setDate(date);
/**
* onceSched object is instantiated. 31/10/2022 is the date set
* for the activities that happen once a year. 
*/	
		OnceSchedule onceSched = new OnceSchedule();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2022);
		cal2.set(Calendar.MONTH, Calendar.OCTOBER);
		cal2.set(Calendar.DAY_OF_MONTH, 31);
		Date date2 = cal2.getTime();
		onceSched.setDate(date);
        
    	System.out.println("PerMonthSchedule is a subclass of Schedule:");
	    boolean a = in.nextBoolean();
/**
 * isAssignableFrom() method is responsible for determining if class "Schedule" is a superclass of "PerMonthSchedule".
 */
        System.out.println("Expected: " + Schedule.class.isAssignableFrom(perMonth.getClass()));
        
        System.out.println("OnceSchedule is a subclass of Schedule:");
	    boolean b = in.nextBoolean();
/**
 * isAssignableFrom() method is responsible for determining if class "Schedule" is a superclass of "OnceSchedule".
 */
        System.out.println("Expected: " + Schedule.class.isAssignableFrom(onceSched.getClass()));
        
        System.out.println("PerMonthSchedule have no extra fields:");
		 boolean c = in.nextBoolean(); 
		 boolean extraField = true;
/**
 *  getDeclaredFields() method is used to determine if extra fields have been declared in PerMonthSchedule class.
 */
		 Field[] extraFields = PerMonthSchedule.class.getDeclaredFields(); 
		 if(extraFields.length == 0) { 
			 extraField = true; 
		 }
		
		System.out.println("Expected: " + extraField);
		
		 System.out.println("OnceSchedule scheduled activities have no extra fields:");
		 boolean d = in.nextBoolean(); 
		 boolean extraField1 = true;
/**
 *  getDeclaredFields() method is used to determine if extra fields have been declared in OnceSchedule class.
 */
		 Field[] extraFields1 = PerDaySchedule.class.getDeclaredFields(); // //
		 if(extraFields1.length == 0) { 
			 extraField1 = true; 
		 }
		
		System.out.println("Expected: " + extraField1);

        System.out.println(perMonth.DueOn(2021, 02, 02) + "\n" + "Expected: True");// set date of 02 of any month is passed to check the returned value of DueOn()
     
        System.out.println(onceSched.DueOn(2022, 9, 11) + "\n" + "Expected: False");// a wrong date is passed to check whether dueOn() returns false.
 
        System.out.println(onceSched.DueOn(2022, 10, 31) + "\n" + "Expected: True");//set date of October 31 is passed to check whether DueOn() returns true
          
    }
       
}

