package StopWatch;
import java.time.LocalTime;

public class StopWatch {
    public static int[] selectionSort(int...a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int tempt = a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int [1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        LocalTime start = LocalTime.now();
        a = selectionSort(a);
        LocalTime end = LocalTime.now();
        StopWatch1 sw = new StopWatch1(start, end);
        System.out.println("Time: " + sw.getELapsedTime());
        for (int x : a) {
            System.out.println(x);
        }
    }
}
