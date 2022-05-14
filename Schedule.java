/**
This is the Schedule Superclass class that keeps a track of the aircraft maintenance scheduled activities.
Review this code carefully and fill required loopholes.
*/
public abstract class Schedule
{
private String description;

/**
   Constructs an schedule without a description.
*/
public Schedule()
{
   description = "";
}

/**
   Sets the description of this schedule.
   @param description the text description of the schedule
*/
public void setDescription(String description)
{
   this.description = description;
}

/**
   Determines if this scheduled activity happens on the given date.
   @param year the year
   @param month the month
   @param day the day
   @return true if the scheduled activity happens on the given date.
*/

/**
TO DO: Include the abstract method  DueOn() here.
*/
public abstract boolean DueOn(int year, int month, int day);

	

/**
   Converts scheduled activity to string description.
*/
public String toString()
{
   return description;
}
}