package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JumpingClouds {
    public static void main(String args[]){
       // int[] cloudArray=new int[] {0,0,1,0,0,1,0};
       // System.out.println(jumpingClouds(cloudArray));

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] cloudArray = new int[sizeOfArray];
        for(int i = 0; i< sizeOfArray; i++) {
            if(sc.hasNextInt()) {
                cloudArray[i]= sc.nextInt();
            }
        }
        System.out.println(jumpingClouds(cloudArray));
    }

    private static int jumpingClouds(int[] cloudArray) {
        int numberOfSteps = -1;
        for(int i=0;i<cloudArray.length;i++,numberOfSteps++){
            if(i+2<cloudArray.length && cloudArray[i+2]==0 ) {
                i++;
            }
        }
        return numberOfSteps;
    }
}
