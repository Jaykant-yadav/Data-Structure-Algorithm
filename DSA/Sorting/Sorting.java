public class Sorting {
    //Print Arrays function
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Bubble sort - O(n2)
    public static void BubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                //incresing -> (>) & decresing -> (<)
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //Selection Sort - O(n2)
    public static void selectionSort(int arr[]){
        //turn -> i
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                //incresing -> (>) & decresing -> (<)
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    //Insertion sort - O(n2)
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 9, 7, 6};
        // BubbleSort(arr);
        
        // selectionSort(arr);

        insertionSort(arr);
        printArr(arr);
    }
}
