package DSA.Arrays;

class maxSumOfSubArrays {
    //Brute Force - O(n3)
    public static void maxSumSubArrays(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currSum = 0; // value always change
                for(int k=i; k<=j; k++) {
                    // System.out.print(arr[k] + " ");
                    //sub Arrays Sum
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max of Total SubArrays Sum : " +  maxSum);
    }
    public static void main(String[] args) {
        // int arr[] = {2, 4, 6, 8, 10};
        int num[] = {1, -2, 6, -1, 3};
        maxSumSubArrays(num);
    }
    
}