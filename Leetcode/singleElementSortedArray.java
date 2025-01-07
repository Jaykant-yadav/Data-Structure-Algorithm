public class singleElementSortedArray {
    public static int singleElement(int arr[]){
        int n = arr.length;

        if(n == 1) {
            return arr[0];
        }

        int st = 0, end = n-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(mid == 0 && arr[0] != arr[1]) {
                return arr[mid];
            }

            if(mid == n-1 && arr[n-1] != arr[n-2]) {
                return arr[mid];
            }

            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]) {
                return arr[mid];
            }

            if(mid % 2 == 0) { //even
                if(arr[mid - 1] == arr[mid]){ //left
                    end = mid - 1;
                } else { //right
                    st = mid + 1;
                }
            } else { //odd
                if(arr[mid - 1] == arr[mid]){ //right
                    st = mid + 1;
                } else { //left
                    end = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4 , 4};
        System.out.println(singleElement(arr));
    }
}
