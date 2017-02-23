package timeAssignment;

import java.util.*;
/**
 * @author IvanC
 * The purpose of this class is to simulate a 24 hour clock
 */
public class Time
{
     private int hour;
     private int minute;

     /*
      *Default constructor that sets time to 0000.
      */
     public Time()
     {
    	 hour = 0;
    	 minute = 0;
     }

     /*
      * If h is between 1 and 23 inclusive, hour is set to h.
      * Otherwise, the hour is set to 0. If m is between 0 and 59 inclusive,
      * the minutes is set to m. Otherwise, the minutes is set to 0.
      */
     public Time(int h, int m)
     {
       if(h >= 1 && h <= 23){
    	   hour = h;
       } else {
    	   hour = 0;
       }

       if(m >= 0 && m <= 59){
    	   minute = m;
       } else {
    	   minute = 0;
       }
     }

     /* Returns the time as a String of length 4 in the format: 0819.
      * If the hour or minute is one digit, it prints a zero first.
      * For example, 6 should print as 06.
     */
     public String toString()
     {
       String time = "";
       if(hour < 10){
    	   time += "0" + hour;
       } else {
    	   time += hour;
       }

       if(minute < 10){
    	   time += "0" + minute;
       } else {
    	   time += minute;
       }
       return time;
     }

     /*
      * Returns the time as a String converted from military time
      * to standard time. For example, 0545 becomes 5:45 AM and
      * 1306 becomes 1:06 PM.
      */
     public String convert()
     {
       String time = "";
       boolean aM = false;

       //Determine if the time is in the AM or PM
       if(hour < 12 && hour >= 0){
    	   //The time is in the morning
    	   aM = true;
       }

       //Determine the standard time from the military time
       if(hour <= 12 && hour >= 1){
    	   time += hour + ":" + minute + " ";
       } else {
    	   if(hour == 0){
    		  time += "12:" + minute + " ";
    	   } else if(hour == 13){
    		   time += "01: " + minute + " ";
    	   } else if(hour == 14){
    		   time += "02: " + minute + " ";
    	   } else if(hour == 15){
    		   time += "03: " + minute + " ";
    	   } else if(hour == 16){
    		   time += "04: " + minute + " ";
    	   } else if(hour == 17){
    		   time += "05: " + minute + " ";
    	   } else if(hour == 18){
    		   time += "06: " + minute + " ";
    	   } else if(hour == 19){
    		   time += "07: " + minute + " ";
    	   } else if(hour == 20){
    		   time += "08: " + minute + " ";
    	   } else if(hour == 21){
    		   time += "09: " + minute + " ";
    	   } else if(hour == 22){
    		   time += "10: " + minute + " ";
    	   } else if(hour == 23){
    		   time += "11: " + minute + " ";
    	   }
       }

       if(aM){
		   time += "AM";
	   } else {
		   time += "PM";
	   }

       return time;
     }

    /*
     * Advances the time by one minute.
     */
    public void increment()
    {
      if(minute == 59){
    	  if(hour == 23){
    		  hour = 0;
    		  minute = 0;

    	  } else {
    		  hour++;
    		  minute = 0;
    	  }
      } else {
    	  minute++;
      }
    }

}
