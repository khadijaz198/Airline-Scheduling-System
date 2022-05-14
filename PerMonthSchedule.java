/**
   This is a schedule of activities that happen on the same day every month.
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A new class PerMonthSchedule is created that inherits the superclass Schedule
 * PerMonthschedule activities happen every month of the year. 
 * @author khadija
 *
 */

public class PerMonthSchedule extends Schedule{
	
	/**
	 * constructor is created which is chained to superclass constructor
	 */
	public PerMonthSchedule()
	{
		super();
	}
	Date date;
	
	/**
	 * DueOn method returns true or false if the new subclass
	 * object's day of the month meet the requirement.	
	 */
	public boolean DueOn(int year, int month, int day)
	{
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int d = calendar.get(Calendar.DAY_OF_MONTH);
		
		
		if(d == day) {
			return true;
		} else {
			return false;
		}	
	}
	
	/**
	 * a new method setDate is included to represent the date set for the activities that occur
	 * every month of the year.
	 * @param d
	 */
	 	
	public void setDate(Date d) {
		date = d;
	}

}
