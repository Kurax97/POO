package date;
import date.*;
/**
 * Can accsess to the date, get the day after/before, get the gap between two date and get the date n  days after
 * 
 * @author Benlamlih Mohammed
 * @version 1.0
 */

public class Date {

    // Atribuits of the class
    private int day;
    private Month month;
    private int year;


    /** the constructor of the class Date with 3 parameters
    * @param day the day of the date we want to create
    * @param month the month of the date we want to create
    * @param year the year of the date we want to create
    */
    public Date(int day, Month month, int year){
	if (day > 0 && day <= month.nbJours(year)){
	    this.day = day;
	}	
	this.month = month;
	if (year > 0){
	    this.year = year;
	}
    }

     /** return the day of this date
     * @return the date's day
     */
     public int getDay(){
	 return this.day;
     }


     /** return the month of this date
     * @return the date's month 
     */
     public Month getMonth(){
	 return this.month;
     }

     
     /** return the year of  this date
     * @return the date's year 
     */
     public int getYear(){
	 return this.year;
     }
	
 
     /** return the day after 
     * @return the day after
     */
     public Date tomorrow(){
	 int nextD;
	 Month nextM;
	 int nextY;

	 if ( this.day + 1 > this.month.nbJours(this.year)){
	     nextD = 1;
	     if (this.month.equals(Month.DECEMBER)){
		 nextY = this.year + 1;
	     	 nextM = this.month.nextMonth();
	     }
	     else{
	     	nextY = this.year;
	     	nextM = this.month.nextMonth();
	     }
	  }else{
	     nextD = this.day + 1;
	     nextM = this.month;
	     nextY = this.year;
	     }
	  return new Date(nextD, nextM, nextY);
     }

     /** return date after n days
     * @param n the date after n days
     * @return the date after n days
     */
     public Date afterNDays(int n) throws IllegalArgumentException{
	 if  (n < 0)
	     throw new IllegalArgumentException("Enter a positive number!");
	 Date result = new Date(this.day, this.month, this.year);
	 for (int i = 0; i < n; i++)
	     result = result.tomorrow();
	 return result;
     }

     /** return 1 if this is before, -1 if d is before this, 0 otherwise
     * @param d the date that we want to compare it with
     * @return 1 if this is before, -1 if d is before this, 0 otherwise
     */
     public int compare(Date d){
	 if (this.year < d.year)
	     return 1;
	 else if (this.year > d.year)
	     return -1;
	 else{
	    int cM = this.month.compareMonth(d.month);
	    if (cM != 0)
		return cM;
	    else{
		if (this.day < d.day)
		    return 1;
		else if (this.day > d.day)
		    return -1;
		else
		    return 0;
	    }
	 }
     }

     /** return true if it is a leap year, false otherwise
     * @return true if it is a leap year, false otherwise
     */
     public boolean isLeapYear(){
	 if (((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year %400 == 0))
	     return true;
	return false;
     }
     /**
     * More effective way to calculate the gap (still have little problems)

     public int gapYears(Date d){
	 int count = 0;
	 if (this.year < d.year){
	     while (d.year > this.year){
		 if (this.isLeapYear())
		     count = count + 366;
		 else
		     count = count + 365;
		 this.year += 1;
	     }
	     return count;
	 }
	 else if (this.year > d.year){
	     while (d.year < this.year){
		 if (d.isLeapYear())
		     count = count + 366;
		 else
		     count = count + 365;
		 d.year += 1;
	     }
	     return count;
	  }
	  else
	      return 0;
     }

     public int gabMonths(Date d){
	 int count = 0;
	 int c = this.month.compareMonth(d.month);
	 if (c == 1){ // this.month before d.month
	     int firstDiff = this.month.nbJours(this.year) - this.day;
	     count += firstDiff;
	     Month newM = this.month.nextMonth();
	     while (newM != d.month){
		 count += newM.nbJours(this.year);
		 newM = newM.nextMonth();
	     }
	     count += d.day;
	     return count;
	 }
	 else if (c == -1){ // d.month before this.month
	     int firstDiff = d.month.nbJours(d.year) - d.day;
	     count += firstDiff;
	     Month newM = d.month.nextMonth();
	     while (newM != d.month){
		 count += newM.nbJours(d.year);
		 newM = newM.nextMonth();
	     }
	     count += this.day;
	     return count;
	 }
	  else
	     return Math.abs((this.day - d.day));
     }

     public int gap(Date date){
	 int c = this.compare(date);
	 int count = 0;
	 if (c == 0)
	     return 0;
	 else{
	     count += this.gapYears(date);
	     if (this.month.compareMonth(date.month) == 1)
		 count += this.gabMonths(date);
	     else if (this.month.compareMonth(date.month) == -1)
		 count -= this.gabMonths(date);
	     }
	 return count;
     }*/

     /** return the number of days between the two dates
     * @param date the date that we want to calculate the gap between
     * @return the gap between two dates
     */
     public int gap(Date date){
	 int c = this.compare(date);
	 int count = 0;
	 if (c == 1){
	     Date newD = new Date(this.day, this.month, this.year);
	     while (newD.equals(date) == false){
		newD = newD.tomorrow();
		count += 1;
	     }
	     return count;
	 }
	 else if (c == -1){
	     Date newD = new Date(date.day, date.month, date.year);
	     while (this.equals(newD) == false){
		newD = newD.tomorrow();
		count += 1;
	     }
	     return count;
	 }
	else
	    return 0;
     }

     /** two dates are equals if they have the same day the same month and the same year
     * @param O the object to test equality with 
     * @return <code>true</code> if O is a date with the same day, month and year than this objec
     */
     public boolean equals(Object O){
	 if (!(O instanceof Date))
	     return false;
	 Date other = (Date) O;
	 return this.year == other.year && this.month == other.month && this.day == other.day;
     }

     /**
     * @return a string description of this date 
     */
     public String toString(){
	 return "On est le " + this.day + " " + this.month + " " + this.year + ".";
     }

}

