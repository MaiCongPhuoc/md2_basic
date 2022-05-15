package SmallestValueInArray;

public class SmallestValue {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,22,6,40,7};
        int min = arr[0];
        for (int i = 0; i < arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest value is: " + min);
    }
}
