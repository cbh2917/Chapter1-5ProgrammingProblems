
/**
 * 
 * @author Christopher Hall
 * Purpose: Returns the next or previous day told by the user
 *
 */
public class Day {
	
	private int day;
	private final String [] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; 
	
	/**
	 * has the day set to the default value
	 */
	public Day() {
		day = 0;
	}
	
	/**
	 * Initializes the day int to the parameter
 	 *@param day a day to the default value
	 */
	public Day(int day) {
		this.day = day;
	}
	
	/**
	 * sets day
 	 *@returns day as a string int 
	 */
	public void setDay(int string) {
		this.day = string;
	}
	
	/**
	 * gets day
 	 *@returns day as a string int
	 */
	public int getDay(){
		return day;
	}
	
	/**
	 * sets nextDay
 	 *@returns day of the week +1 
	 */
	public String nextDay() {
		return daysOfWeek[day+1];
	}
	
	/**
	 * sets previousDay
 	 *@returns day of the week -1
	 */
	public String prevDay() {
		return daysOfWeek[day-1];
		
	}
	
	/**
	 * 
 	 *@returns day of the week with formual if its the next day
	 */
	public String calculatenextDay(int num) {
		return daysOfWeek[day+num % 7];
	}
	
	/**
	 * 
 	 *@returns day of the week with formual if its the previous day 
	 */
	public String calculatepreDay(int num) {
		return daysOfWeek[((Math.abs(day-num) % 7) - 1)];
	}
	
	public String tostring(){
		return "Day [day =" + day + ", getDay()=" +getDay()
		          +"]";
	}

}