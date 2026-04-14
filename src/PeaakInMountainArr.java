public class PeaakInMountainArr {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));
    }

        static int peakIndexInMountainArray ( int[] arr){
                int start = 0;
                int end = arr.length - 1;
                while (start < end) {
                    int mid = start + (end - start) / 2;
                    if (arr[mid] < arr[mid + 1]) {
                        start = mid + 1;
                    } else {
                        end = mid;
                    }
                }
                return start;
            }
        }

//      ALTERNATIVE METHOD
//    public static int searchPeak(int[] arr) {
//        int ans = 0;
//        int start = 0;
//        int end = arr.length - 1;
//        int mid = start + ((end - start)/2);
//        if(arr[mid]<arr[mid+1]) {
//            start = mid + 1;
//            ans = search(arr,start, end);
//        } else{
//              end = mid;
//              ans = search(arr,start,end);
//        }
//    }
//    public static int search(int[] arr, int start, int end){
//        while(start!=end) {
//            int mid = start + ((end - start) / 2);
//            if (arr[mid] < arr[mid + 1]) {
//                start = mid + 1;
//            }else{
//                end = mid;
//            }
//        }
//        return start;
//        }
