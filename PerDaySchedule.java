import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * A new class PerDaySchedule is created that inherits the superclass Schedule
 * PerDaySchedule activities happen everyday. 
 * @author Khadija
 *
 */
public class PerDaySchedule extends Schedule
{	
	/**
	 * constructor is created which is chained to superclass constructor
	 */
	public PerDaySchedule() {
		
		super();
	}

	/**
	 * DueOn method returns true as the perDay activities 
	 * occur everyday.	
	 */
	public boolean DueOn(int year, int month, int day) {
		return true;
	}

}
