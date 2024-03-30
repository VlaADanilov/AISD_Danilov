import java.util.Arrays;

public class Relazation {
    
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end){
        if (arr.length == 0 || start >= end) return;
        int middle = (end + start) / 2;
        int m = arr[middle];
        int left = start, right = end;
        while (left <= right){
            while (arr[left] < m) left++;
            while (arr[right] > m) right--;
            if (left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        if (start < right)quickSort(arr, start, right);
        if (left < end) quickSort(arr, left, end);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
