package Array_Problems;

import java.util.Arrays;

public class Manipulation_prob {
    public static void revArray(int[] arr){

        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k: arr){
            System.out.println(k);
        }
    }

//    public static int[] revArray(int[] arr){
//        int n = arr.length;
//        int[] reversed = new int[n];
//        int i = 0;
//        int j = n-1;
//
//        while(i < n){
//            reversed[j] = arr[i];
//            i++;
//            j--;
//        }
//        return reversed;
//    }

    public static void shiftBy1(int[] brr){
        int n = brr.length;
        int temp = brr[n-1];

        for(int i = n-1; i>0;i--){
            brr[i] = brr[i-1];
        }
        brr[0] = temp;
    }

//    public static int[] shiftBy1(int[] brr){
//        int n = brr.length;
//        int[] shifted = new int[n];
//        int temp = brr[n-1];
//
//        for(int i = n-1; i > 0;i--){
//            shifted[i] = brr[i-1];
//        }
//        shifted[0] = temp;
//        return shifted;
//    }
    public static void printExtreme(int[] crr){
        int n = crr.length;
        int i = 0;
        int j = n-1;

        while(i<=j){
            if(i==j){
                System.out.println(crr[i]);
                return;
            }
            else {
                System.out.print(crr[i]);
                i++;
                System.out.print(crr[j]);
                j--;
            }
        }

    }



    public static void main(String[] args){

        int[] arr = {5,2,6,2,7,9};
        revArray(arr);
        System.out.println();

//        int[] arr = {3,5,6,2,6,2};
//        int[] ans = revArray(arr);
//        System.out.println("Reversed Array is: " + Arrays.toString(ans));

//        int[] brr = {5,3,6,2,6,9};
//        int[] bns = shiftBy1(brr);
//        System.out.println("Shifted Array is : " + Arrays.toString(bns));

        int[] brr = {7,8,2,9,5};
        System.out.println("After shifting by 1:- ");
        shiftBy1(brr);
        for (int m:brr){
            System.out.println(m);
        }

        int[] crr = {1,2,3,4,5,6,7};
        System.out.println("extreme starts:-");
        printExtreme(crr);
    }
}
