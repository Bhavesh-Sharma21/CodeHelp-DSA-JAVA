package Array_Problems;

import java.util.*;

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

    static int getMode(int[] drr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: drr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

//        for(int i: freq.keySet()){
//            //i -> will represent key
//            System.out.println(i + " -> " + freq.get(i));
//        }
        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for(int key : freq.keySet()){
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if(currentKeyKiFrequency > maxFreq){
                //mujhe naya max mil gya
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        // jab loop se bahar aaoge toh max freq wali key ready hogi
        return maxFreqWaliKey;
    }

    static int[] getHighestandLowestFreqElement(int[] err){
        HashMap<Integer,Integer> freq = new HashMap<>();
        //Insert Data...
        for(int num: err){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        //Hashmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

         for(int key: freq.keySet()){
             int currentkey = key;
             int currentFreq = freq.get(key);
             if(currentFreq > highestFreq){
                 //update to highest
                 highestFreq = currentFreq;
                 highestNum = currentkey;
             }
         }

         int lowestFreq = Integer.MAX_VALUE;
         int lowestNum = -1;

         for(int key: freq.keySet()){
             int currentKey = key;
             int currentFreq = freq.get(key);
             if(currentFreq < lowestFreq){
                 //update to lowest
                 lowestFreq = currentFreq;
                 lowestNum = currentKey;
             }
         }
         int[] ans = {highestNum, lowestNum};
         return ans;
    }
//Homework....
    public static void shiftByK(int[] frr, int k){
        int n = frr.length;
        k = k%n;
        if(k == 0) return;

        int[] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = frr[n - k + i]; //last k element save
        }
        for(int i = n-1; i >= k; i--){
            frr[i] = frr[i-k];     // remaining all move k step forword
        }
        for(int i = 0; i < k; i++){
            frr[i] = temp[i];   //add temp in starting
        }
    }

    public static void printUnion(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        for(int num: arr1){
            set1.add(num);
        }
        Set<Integer> union = new LinkedHashSet<>();//Preserves union order , avoids duplicates...
        for(int num: arr2){
            if(set1.contains(num)){
                union.add(num);
            }
        }
        System.out.println("Union : " + union);
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

        int[] drr = {1,2,2,3,3,4,4,4,5,5,5,5,5};
        int cns = getMode(drr);
        System.out.println("The mode is : " + cns);

        int[] err = {1,2,2,3,3,3,5,5,5,8,8,8,8};
        int[] dns = getHighestandLowestFreqElement(err);
        System.out.println("The highest Freq element is: " + dns[0]);
        System.out.println("The lowest Freq element is: " + dns[1]);

//Homework....
        int [] frr = {3,5,8,9,1,6};
        int k = 6;
        shiftByK(frr,k);
        System.out.println(Arrays.toString(frr));

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        printUnion(arr1,arr2);

    }
}
