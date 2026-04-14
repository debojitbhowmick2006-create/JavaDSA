import java.util.Arrays;

public class ElementInInfiniteArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99};
        int target = 22;
        System.out.println(findrange(arr, target));
    }
    static int findrange(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]){
        int temp = end + 1;
        // end  = previous end + size of box * 2.
        end = end + (end - start+1)*2;
        start = temp;
        }
        return binarysearch(arr, target, start, end);
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
//           int mid = (start+end)/2;      this may give error because the (start + end) may exceed the int limit.
            int mid = start + ((end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else if (target == arr[mid]) {
                return mid;
            }
        }
        return start;
    }
}
