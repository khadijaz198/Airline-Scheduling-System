import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A new class OnceSchedule is created that inherits the superclass Schedule
 * onceschedule activities happen only once on a specific day of the year. 
 * @author khadija
 *
 */
public class OnceSchedule extends Schedule {

	/**
	 * constructor is created which is chained to superclass constructor
	 */
	public OnceSchedule()
	{
		super();
	}
	
	Date date;
/**
 * DueOn method returns true or false if the new subclass
 * object's day, month and year meet the requirement.	
 */
	public boolean DueOn(int year, int month, int day)
	{
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int y = calendar.get(Calendar.YEAR);
		int m = calendar.get(Calendar.MONTH) + 1;
		int d = calendar.get(Calendar.DAY_OF_MONTH);
		
		
		if(y == year && m == month && d == day) {
			return true;
		} else {
			return false;
		}	
	}
/**
 * a new method setDate is included to represent the date set for the activities that occur
 * one a specific day of the year.	
 * @param d
 */
	public void setDate(Date d) {
		date = d;
	}
}
