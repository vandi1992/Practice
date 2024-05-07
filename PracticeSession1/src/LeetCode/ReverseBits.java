package LeetCode;

import java.math.BigInteger;

//https://leetcode.com/problems/reverse-bits/description/
//Reverse bits of a given 32 bits unsigned integer.
public class ReverseBits {

    public static void main(String[] args) {
        int n=43261596;
        System.out.println("Reversed bits for "+n+" : "+reverseBits(n));
    }

    private static int reverseBits(int n) {
        int result=0;
      /*  for(int  i =0;i<32;i++){
            int LSB = 0;
            if(((n>>i)&1)==1){
                LSB=1<<31-i;
                result = result|LSB;
            }
        }*/

       // if(n&1<<i)
            return result;

       // return result;
    }


}
