package date;
import date.*;
public enum Month {
	JANUARY(31),
	FEBRUARY(28),
	MARCH(31),
	APRIL(30),
	MAY(31),
	JUIN(30),
	JULY(31),
	AUGUEST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVEMBER(30),
	DECEMBER(31);
    private final int days;
    Month(int days){
	this.days = days;
    }
    /** return the next month
    * @return the month that comes after this one
    */
    public Month nextMonth() {
	return this.ordinal() < Month.values().length - 1 ? Month.values()[this.ordinal() + 1] : Month.JANUARY;
    }

    /** return the number of days in a month depending on the current year
    * @param year the year of the month 
    * @return the number of days the month
    */
    public int nbJours(int year){
	if (this == Month.FEBRUARY && (((year % 4 == 0) && (year % 100 != 0)) || (year %400 == 0)))
	    return 29 ;

	else
	    return this.days;
    }
    /** return 1 if the this month comes before mois, 0 if it is the same month, -1 otherwise
    * @param mois the other month that we want to comapare it with this
    * @return 1 if the this month comes before mois, 0 if it is the same month, -1 otherwise
    */
    public int compareMonth(Month mois){
	if (this.ordinal() < mois.ordinal()) 
	    return 1; // February > July | (because february comes before july)
	else if (this.ordinal() >  mois.ordinal()) 
	    return -1;
	else
	    return 0;

    }
}

