package DSA.recursion;

public class recursion {
    //Decreasing Order
    public static void descOrder(int num) {
        //Base case
        if(num == 1) {
            System.out.println(num);
            return;
        }
        //print num
        System.out.print(num+ " ");
        descOrder(num-1); // func recursive call yourself
    }

    //Increasing Order
    public static void increOrder(int num) {
        //Base case
        if(num == 1) {
            System.out.print(num + " ");
            return;
        }
        increOrder(num-1); // func recursive call yourself
        //print num
        System.out.print(num+ " ");
    }

    //Print Factorial
    public static int printFacto(int num) {
        //Base case
        if(num == 0) {
            return 1;
        }
        // int fnm1 = printFacto(num-1); // func recursive call yourself
        // int fn = num * fnm1;
        // return fn;

        return num * printFacto(num-1);
    }

    //Print Natural Numbers
    public static int sumOfNaturalNum(int n) {
        //Base case
        if(n == 1) {
            return 1;
        }

        return sumOfNaturalNum(n-1) + n;
    }

    //Calculate nth term in fibonacci
    public static int fib(int n) {
        //Base case
        if(n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //Check if given array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    //WAF to find the first occurence of an element in an Array
    public static int firstOccur(int arr[], int idx, int key) { //TC & SC -> O(n)
        if(idx == arr.length) {
            return -1;
        }
        if(arr[idx] == key) {
            return idx;
        }

        return firstOccur(arr, idx+1, key);
    }

    //WAF to find the last occurence of an element in an Array
    public static int lastOccur(int arr[], int idx, int key) { //TC & SC -> O(n)
        if(idx == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, idx+1, key);
        if(isFound == -1 && arr[idx] == key) {
            return idx;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int num = 6;
        // descOrder(num);
        // increOrder(num);
        // System.out.println(printFacto(num));
        // System.out.println(sumOfNaturalNum(num));
        // System.out.println(fib(num));
        int arr[] = {1, 2, 3, 6, 4, 5, 8, 5};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccur(arr, 0, 5));
        System.out.println(lastOccur(arr, 0, 5));


    }
}
