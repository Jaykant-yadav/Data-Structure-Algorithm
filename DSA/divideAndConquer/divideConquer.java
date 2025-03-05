package DSA.divideAndConquer;

public class divideConquer {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort
    public static void mergeSort(int arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        // Work
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei); // Merge left & right
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // Temp Array
        // left(0, 3) right(4, 6) = 3 -> 6 - 0 -> 6 + 1 => 7
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Quick Sort
    public static void quickSort(int arr[], int si, int ei) {
        //base case
        if(si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make palce for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    //Search in rotated Sorted Array - Binary Search
    public static int searchInRotatedArr(int arr[], int target, int si, int ei) {
        //Base Case
        if(si > ei) {
            return -1;
        }
        //kaam
        int mid = si+(ei-si) / 2; //(si+ei)/2
        //case Found
        if(arr[mid] == target) {
            return mid;
        }

        //Mid on L1
        if(arr[si] <= arr[mid]) {
            //Case a: left
            if(arr[si] <= target && target <= arr[mid]) {
                return searchInRotatedArr(arr, target, si, mid-1);
            }else {
                //Case b : right
                return searchInRotatedArr(arr, target, mid+1, ei);
            }
        } 

        //Mid on L2
        else {
            //Case c : right
            if(arr[mid] <= target && target <= arr[ei]) {
                return searchInRotatedArr(arr, target, mid+1, ei);
            } else {
                //Case d : left
                return searchInRotatedArr(arr, target, si, mid-1);
            }

        }
        
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        // mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // printArr(arr);
        System.out.println(searchInRotatedArr(arr, 6, 0, arr.length-1));
            
    }
}
