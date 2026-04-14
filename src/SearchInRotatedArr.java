import java.util.Arrays;

public class SearchInRotatedArr {
    public static void main(String[] args) {
        int[] arr = {6,7,0,1,2,3,4,5};
        int target = 4;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int pivot = searchPivotInRotatedArray(arr);
        if(target<=arr[pivot]&&target>=arr[0]){
            return binarysearch(arr,target, 0, pivot);
        }else{
            return binarysearch(arr, target, pivot+1, arr.length-1);
        }
    }
    static int searchPivotInRotatedArray(int[] arr) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            return end;
        }
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (mid < end && arr[mid] > arr[mid + 1]) {
                ans = mid;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                ans = mid - 1;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
//           int mid = (start+end)/2;      this may give error because the (start + end) may exceed the int limit.
            int mid = start + ((end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
