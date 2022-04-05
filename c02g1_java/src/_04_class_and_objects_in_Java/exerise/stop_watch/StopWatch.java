package _04_class_and_objects_in_Java.exerise.stop_watch;

import java.util.Arrays;

public class StopWatch {
   private long startTime ;
   private long endTime ;

   public StopWatch(){
   }
    public long getStarTime(){
       return this.startTime ;
    }
    public long getEndTime(){
       return this.endTime ;
    }
    public long start(){
     return this.startTime = System.currentTimeMillis();
    }
    public long stop(){
       return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
       return this.endTime - this.startTime;
    }
    public String arrange(int [] array){
       return Arrays.toString(array);
    }

}
