import jdk.jfr.Timespan;

public class RelazationFORCOUNT {

    static class Counter{
        int number;
    }

    public static void quickSort(int[] arr){
        Counter p = new Counter();
        p.number = 0;
        long time1 = System.nanoTime();
        quickSort(arr, 0, arr.length - 1, p);
        long time2 = System.nanoTime();
        System.out.println(" " + (time2 - time1) + " " + p.number);
    }

    private static void quickSort(int[] arr, int start, int end, Counter iterations){
        if (arr.length == 0 || start >= end) return;
        int middle = (end + start) / 2;
        int m = arr[middle];
        int left = start, right = end;
        while (left <= right){
            iterations.number++;
            while (arr[left] < m) left++; iterations.number++;
            while (arr[right] > m) right--; iterations.number++;
            if (left <= right){
                iterations.number++;
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        if (start < right)quickSort(arr, start, right, iterations);
        if (left < end) quickSort(arr, left, end, iterations);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
