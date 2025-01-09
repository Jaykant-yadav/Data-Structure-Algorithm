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
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 9, 7, 6};
        BubbleSort(arr);
        printArr(arr);
    }
}
