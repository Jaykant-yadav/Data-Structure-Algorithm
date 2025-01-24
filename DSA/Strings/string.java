package DSA.Strings;

import java.util.Scanner;

public class string {

    public static void printLatters(String str){
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    //Company -> INTUITE
    public static boolean panlindrome(String str){//O(n)
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String str){
        int x = 0, y = 0;

        for(int i=0; i<str.length(); i++) {
            char dir = str.charAt(i);
            //south
            if(dir == 'S') {
                y--;
            } else if(dir == 'W'){ //west
                x--;
            } else if(dir == 'N'){ //North
                y++;
            } else { //East
                x++;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        
        //Creation of Strings
        String str = "abcd";
        String str2 = new String("XYZ");

        //Strings are IMMUTABLE

        //Input/Output
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String names = sc.nextLine();
        // System.out.println(names);

        //Strings Length
        String fullName = "Jaykant Kumar";
        // System.out.println(fullName.length());

        //Concatenation
        String firstName = "Jaykant", lastName = "Kumar";
        // System.out.println(firstName + " " + lastName);
        // System.out.println(firstName.charAt(0));

        // printLatters(fullName);

        // System.out.println(panlindrome("noon"));

        // System.out.println(getShortestPath("WNEENESENNN"));

        //in Strings Equality check
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        /* if(s1 == s2){ //equal
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){// not equal
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s2)){// equal
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        } */

        // String s = "Helloworld";
        // System.out.println(s.substring(0, 5));
        // System.out.println(substring(s, 0, 5));

        String fruits[] = {"Apple", "Banana", "Mango"};




    }
}
