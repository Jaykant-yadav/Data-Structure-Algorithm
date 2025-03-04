package DSA.divideAndConquer;

public class divideConquer {

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Merge Sort
    public static void mergeSort(int arr[], int si, int ei){
        //Base Case
        if(si >= ei) {
            return;
        }

        //Work
        int mid = si + (ei - si) / 2; //(si+ei)/2
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei); //Merge left & right
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        //Temp Array
        //left(0, 3) right(4, 6) = 3 -> 6 - 0 -> 6 + 1 => 7
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr
        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    //Quick Sort
    public static void quickSort(int arr[], int si, int ei) {
        //last element

    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8, -4};
        mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        // printArr(arr);
        int n = 17;
        for(int i=1; i<=10; i++) {
            System.out.println(i*n);
        }
    }
}
