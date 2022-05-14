import java.lang.reflect.Field;
import java.util.Scanner;

public class ScheduleDriver {
	public static void main(String[] args) {
		
/**
 * object perDay is instantiated.
 */
		PerDaySchedule perDay = new PerDaySchedule();
		
		Scanner in = new Scanner(System.in);
        
    	System.out.println("PerDaySchedule is just a subclass of Schedule:");
	    boolean b = in.nextBoolean();
/**
 * isAssignableFrom() method is responsible for determining if class "Schedule" is a superclass of "PerDaySchedule".
*/
        System.out.println("Expected: " + Schedule.class.isAssignableFrom(perDay.getClass())); 
        
        System.out.println("PerDaySchedule activities have no extra fields:");
		
		 boolean a = in.nextBoolean(); 
		 boolean extraField = true;
/**
* getDeclaredFields() method is used to determine if extra fields have been declared in PerDaySchedule class.
*/
		 Field[] extraFields = PerDaySchedule.class.getDeclaredFields(); // //
		 if(extraFields.length == 0) { 
			 extraField = true; 
		 }
		
		System.out.println("Expected: " + extraField);
		
        System.out.println("Looking at perday schedules:");
        in.nextLine();
        String s1 = in.nextLine();
        perDay.setDescription(s1); //user provided activity is set and printed
        if(s1.equals(perDay.toString())) {
          System.out.println("Expected: " + perDay.toString() + "\n" + perDay.DueOn(0, 0, 0) + "\n" + "Expected: True");
        } else {
        	System.out.println("Expected: false");
    	}
	 }
}

