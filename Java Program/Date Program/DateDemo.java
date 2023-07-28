	import java.util.*;
	
	public class DateDemo
	{
	public static void main(String args[])
	{
	Date d=new Date();
	System.out.println("The Current Date and Time is "+d);
	System.out.println("Year  : "+d.getYear());
	System.out.println("Month  : "+d.getMonth());
	System.out.println("Date  : "+d.getDate());
	System.out.println("Day  : "+d.getDay());
	System.out.println("Hours  : "+d.getHours());
	System.out.println("Minutes  : "+d.getMinutes());
	System.out.println("Seconds  : "+d.getSeconds());
	System.out.println("Time  : "+d.getTime());
	System.out.println("Current Time is  : "+d.getHours()+" : "+d.getMinutes()+" : "+d.getSeconds());

	}
	}