import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
     public LocalTime getStartTime(LocalTime startTime){
         return startTime;
     }
     public LocalTime getEndTime (LocalTime endTime){
         return endTime;
     }

     StopWatch(){
         startTime = LocalTime.now();
     }
     public void start(){
         this.startTime = LocalTime.now();
         getStartTime(startTime);
     }
     public void stop(){
         this.endTime = LocalTime.now();
         getEndTime(endTime);
     }
     public void getElapsedTme(){
         int ElapsedTime = (startTime.toSecondOfDay() - endTime.toSecondOfDay()) * 100;
         System.out.println("Số mili giây đếm được: " + ElapsedTime);
     }
}
