package plusLibrary.Amazon;

public class easyLevelQs {
    //Remove Duplicates from Sorted Arrays
    public static int removeDuplicatesSortedArr(int arr[]) {
        //Approach -> I -> TC - O(n)
        /*int i=0;
        for(int j=1; j<arr.length; j++) {
            if(arr[i] < arr[j]) { //if arr[i] to large arr[j] so increment i+1;
                i++;
            }
        }
        return i;
        */

        //Approach -> II -> TC - O(n), SC - O(1)
        /* int i=0;
        for(int j=1; j<arr.length; j++) {
            if(arr[i] < arr[j]) {
                int temp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return i+1;// Because array stored zero based indexing */

        //Approach -> II -> TC - O(n), SC - O(1)
        int j = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){ //duplicate check
                arr[j] = arr[i]; //unique element replace in array
                j++;
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicatesSortedArr(arr));
    }
}
