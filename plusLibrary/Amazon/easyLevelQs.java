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


    //Merge Sorted Array -> Brute Force -> TC - O(Nlogn), SC - O(n)
    public static int[] mergeSortedArr(int nums1[], int nums2[], int m, int n){
        int res[] = new int[m+n];
        int i=0, j=0, k=0;
        while (i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            res[k] = nums1[i];
            i++; k++;
        }

        while (j < m) {
            res[k] = nums2[j];
            j++; k++;
        }
        return res;
    }

    // Oprimize solution -> TC - O(n+m)
    public static void mergeSortedArr2(int nums1[], int nums2[], int m, int n) {
        // i: Pointer to the last element in nums1 (valid elements, not zeros)
        // j: Pointer to the last element in nums2
        // x: Pointer to the last available position in nums1 (where the merged elements will be placed)
        int i = m - 1, j = n - 1, x = m + n - 1;
    
        // Merge elements from the end of both arrays until one of them is exhausted
        while (i >= 0 && j >= 0) {
            // If the current element in nums1 is greater than the current element in nums2
            if (nums1[i] > nums2[j]) {
                // Place the larger element (from nums1) at the end of the merged array
                nums1[x] = nums1[i];
                // Move the pointer in nums1 to the previous element
                i--;
            } else {
                // Otherwise, place the larger element (from nums2) at the end of the merged array
                nums1[x] = nums2[j];
                // Move the pointer in nums2 to the previous element
                j--;
            }
            // Move the pointer in the merged array to the previous position
            x--;
        }
    
        // If there are remaining elements in nums2 (nums1 is already processed)
        while (j >= 0) {
            // Place the remaining elements from nums2 into the merged array
            nums1[x] = nums2[j];
            // Move both pointers to the previous positions
            x--;
            j--;
        }
        // No need to handle remaining elements in nums1 because they are already in their correct positions.
        // The merged array is now stored in nums1.
    }
    public static void main(String[] args) {
        // int arr[] = {0, 1, 1, 1, 2, 2, 3};
        // System.out.println(removeDuplicatesSortedArr(arr));

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int merge[] = mergeSortedArr(nums1, nums2, 3, 3);
        for(int i=0; i<merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
        System.out.println();

        mergeSortedArr2(nums1, nums2, 3, 3);
        for(int i=0; i<6; i++) {
            System.out.print(nums1[i] + " ");
        }

    }
}
