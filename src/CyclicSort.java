import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, min, temp;
        System.out.print("enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k <= n - 1; k++) {
            System.out.println("enter element" + k);
            arr[k] = in.nextInt();
        }
        i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]) {
                swap(arr, i,correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}