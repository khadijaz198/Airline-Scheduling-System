import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class ScheduleAllTest {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
/**
 * new objects of every class have been created.
 */
		PerDaySchedule perDay1 = new PerDaySchedule();
		PerDaySchedule perDay2 = new PerDaySchedule();
		PerMonthSchedule perMonth1 = new PerMonthSchedule();
		PerMonthSchedule perMonth2 = new PerMonthSchedule();
		OnceSchedule onceSched = new OnceSchedule();
		
/**
 * the following activities occur everyday. Therefore, the activities have been set for object perDay1 and perDay2.
 */
		perDay1.setDescription("Open the aircraft doors.");
		perDay2.setDescription("Clean the doormats.");
		
/**
 * The following activity is set for a specific day of any month in a year.
 */
		perMonth1.setDescription("Change the kitchenwares in the firstclass.");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 02);
		Date date = cal.getTime();
		perMonth1.setDate(date); 
		
/**
* The following activity is set for a specific day of any month in a year.
*/
		perMonth2.setDescription("Dismantle the lights.");
		cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 02);
		date = cal.getTime();
		perMonth2.setDate(date);//02 is set as the day of the month.
		
/**
 * The following is set for a specific day, month and a year. 
 */
		onceSched.setDescription("Clean the rugs with water.");
		cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		date = cal.getTime();
		onceSched.setDate(date);//January 1 2020 is set for the activity.
		
/**
 * An array of object schedule is created to check whether the provided dates match
 * for each object of each schedule class.
 */
		 Schedule[] schedule = new Schedule[5];
		 schedule[0] = perDay1;
		 schedule[1] = perDay2;
		 schedule[2] = perMonth1;
		 schedule[3] = onceSched;
		 schedule[4] = perMonth2;
/**
 * The loop runs for times prompting the user to input a date
 * and returns the activities based on the date provided and according to each schedule object. 
 */
		 
		 for(int i=0; i<4; i++) {
			 System.out.println("Enter a date (like 2020 01 30): ");
			 String DueOn = in.nextLine();
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd", Locale.ENGLISH);
			 LocalDate providedDate = LocalDate.parse(DueOn, formatter);
			 System.out.println("Here are your scheduled activities on " + providedDate.format(DateTimeFormatter.ofPattern("M/d/yyyy"))  + ": ");
			 
			 for(int j=0; j<schedule.length; j++) {
				 if(schedule[j].DueOn(providedDate.getYear(), providedDate.getMonthValue(), providedDate.getDayOfMonth())) {
					 System.out.println(schedule[j].toString());
				 }
			 }
			 System.out.println(""); //empty print line statement for formatting
		 }
	}
}
