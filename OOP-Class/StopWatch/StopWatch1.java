package StopWatch;
import java.time.LocalTime;

public class StopWatch1 {
    private LocalTime startTime, endTime;
    public StopWatch1() {
        startTime = LocalTime.now();
    }
    public StopWatch1(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public  void start() {
        startTime = LocalTime.now();
    }
    public  void stop() {
        startTime = LocalTime.now();
    }
    public int getELapsedTime() {
        int miliSecond = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000);
        return miliSecond;
    }
}
