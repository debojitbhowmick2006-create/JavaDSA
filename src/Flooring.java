public class Flooring {
    public static void main(String[] args) {
        int[] arr = {-54,-32,-21,134,1234}; //already sorted in ascending order.
        int target = -25;
        System.out.println(binarysearch(arr,target));
    }
    //return index
    static int binarysearch(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;
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
        return end;
    }
}
