public class Time {
  
  private int hours;
  private int minutes;
  
  public Time (int h, int m){
  
  hours = h;
  minutes = m;
  
}
  
  private int toMins(){
    int hr = 0, min = 0;
    hr = hours;
    hr *= 60;
    min = minutes + hr;
    return min;
}
  
  public boolean lessThan(Time t){
     int x = 0;
     x = t.toMins();
     Time v = new Time(hours, minutes);
     int m = v.toMins();
     if (m < x){
       return true;
     } else if (m > x){
       return false; 
     }
   return true;
} 
  
  public int elapsedSince(Time t){
    int x = 0, a = 0, b = 0;
    x = t.toMins();
    Time v = new Time(hours, minutes);
    int m = v.toMins(); 
    if (x < m){
     a = m - x;
     return a;
     } else if (x > m){
     a = 1440 - x;
     b += m;
     return a + b;
     }
 return a;
}
  
  public int addTime(int h, int m){
    hours = hours + h;
    minutes = minutes + m;

    if (hours >= 0 && hours <= 23){

    } else {
      hours = hours - 24;
    } 
    if(minutes < 60 && minutes >= 0){
      
    } else {
      minutes = minutes - 60;
      hours++;
      if (hours >= 0 && hours <= 23){
      
      } else {
        hours = hours - 24;
    }
    }
    return hours;
    
  
}
  
  public String toString(){
    if(hours >= 12){
      if (minutes == 0){
       return (hours + ":00");
      }
      return (hours + ":" + minutes);
    } else if (hours < 12){
      if (minutes == 0){
       return (hours + ":00");
      }
      return ("0" + hours + ":" + minutes);
    } else if (hours == 24){
      if (minutes == 0){
       return (hours + ":00");
      }
      return ("00:" + minutes);
    }
  return null;
}
  
  public String to12HourClock(){
    int n = 0;
    int m = 0; 
    m = minutes;
    if (hours > 12){
      n = hours - 12;
    } else if (hours <= 12){
      n = hours;
    } 
    if (n == 0){
      n += 12; 
    }
   
    if (m == 0){
      if(hours <= 12){
      return (n + ":00 AM");
    } else if (hours > 12 && hours < 24){
      return (n + ":00 PM");
    } 
      return (n + ":00");
    }
    
    if(hours <= 12){
      return (n + ":" + m + " AM");
    } else if (hours > 12 && hours < 24){
      return (n + ":" + m + " PM");
    }
    
    
    return (n + ":" + m);

}
  
}