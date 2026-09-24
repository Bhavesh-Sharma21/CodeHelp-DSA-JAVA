package Array_Problems;


public class Basic_prob {
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static int[] multiplyby10(int[] brr){
        int size = brr.length;
        int [] newArray = new int[size];

        for(int i = 0; i< size; i++){
            int element = brr[i];
            int newelement = element * 10;
            newArray[i] = newelement;
        }
        return newArray;
    }

    static boolean findTarget(int [] crr, int target){
        for (int i = 0; i < crr.length; i++){
            if(crr[i] == target){
                return true;
            }
        }
        return false;
    }

    static int getmaxNum(int [] drr){
        int maxvalue = drr[0];

        for(int i = 0; i < drr.length;i++){
            if(maxvalue < drr[i]){
                maxvalue = drr[i];
            }
        }
        return maxvalue;
    }

    static int[] getsumNum(int[] err){
        int posSum = 0;
        int negSum = 0;
        for(int n: err){
            if(n < 0){
                negSum += n;
            }
            else
                posSum += n;
        }
        int[] cns = {posSum,negSum};
        return cns;
    }

    static int[] getOneZerocount(int[] frr){
        int ZeroCount = 0;
        int OneCount = 0;
        for(int i: frr){
            if(i == 0)
                ZeroCount++;

            else if(i == 1)
                OneCount++;
        }
        return new int[]{ZeroCount,OneCount};
    }

    static int getUnsorteElement(int[] grr){
        for(int j: grr){
            if(grr[j+1] <= grr[j])
               return grr[j+1];
        }

        return -1;
    }
    public static void main(String[] args){
         int []arr = {23,63,89,66,83};
         System.out.println(getAverage(arr));

        int [] brr = {45,27,83,92};
        int [] ans = multiplyby10(brr);
        System.out.println("Printing answer array: ");
        for (int i: ans){
            System.out.println(i);
        }

        int[] crr = {3,6,2,8,5};
        boolean bns = findTarget(crr, 9);
        System.out.println(bns);

        int[] drr = {3,6,36,6,25};
        System.out.println(getmaxNum(drr));

        int[] err = {45,-56,-3,8,10,-2};
        int[] cns = getsumNum(err);
        System.out.println("Positive Sum = " + cns[0]);
        System.out.println("Negetive Sum = " + cns[1]);

        int[] frr = {1,4,0,1,6,2,0,1};
        int[] dns = getOneZerocount(frr);
        System.out.println("Number of Zero's are: " + dns[0]);
        System.out.println("Number of One's are: " + dns[1]);

        int[] grr = {1,2,5,4,9};
        System.out.println(getUnsorteElement(grr));


    }
}
