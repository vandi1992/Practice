package LeetCode;

public class NumberOf1Bits {

    public static void main(String[] args) {
        int n = 110011;
        System.out.println("Number of 1 bits = " +hammingWeight(n));
    }


    public static int hammingWeight(int n) {
        int countSetBit = 0;
        while(n!=0){
            countSetBit++;
            n&=n-1;

        }
        return countSetBit;
    }
}
