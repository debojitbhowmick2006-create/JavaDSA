import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, min, temp;
        System.out.print("enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k <= n-1; k++) {
            System.out.println("enter element" + k);
            arr[k] = in.nextInt();
        }
        for (i = 0; i < n-1; i++) {
            min = i;
            for(j = i+1; j < n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        //alternative method using function.
        Selec(arr);
        System.out.println(Arrays.toString(arr));
    }

static void Selec(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        int last = arr.length - i - 1;
        int maxIndex = getmaxIndex(arr, 0, last);
        if (maxIndex != last) {
            swap(arr, maxIndex, last);
        }
    }
}
static void swap(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
    }
static int getmaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start+1; i <= end; i++) {
        if(arr[i]>arr[start]){
            max = i;
        }
    }
    return max;
}
}