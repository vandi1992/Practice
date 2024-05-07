package Extras;


//Bit masking
//Switch On the ith bit
public class Bitwise {

    public static void main(String[] args){
        int n=36; //00100100
        int i=3;

        System.out.println("Switch OFF : " +switchOFF(n,i));
        System.out.println("Switch ON : " +switchON(n,5));
        //Toggle a single bit = ith position
        System.out.println("Toggle : " +toggle(n,5));
        System.out.println("Check bit status : " +checkBitStatus(n,4));

    }

    private static String checkBitStatus(int n, int i) {
        int statusMask = (1<<i);
        return(n&statusMask)>0?"Set":"Unset";
    }

    private static int toggle(int n, int i) {
        //Using XOR operator to toggle the single bit at ith position.
        int toggleMask = 1<<i;
        return n^toggleMask;
    }

    private static int switchOFF(int n, int i) {
        // And with Off Mask.
        // Offmask  =  Left Shifting 1 by i bits and then flipping them.
        int offMask = ~(1<<i);
        return(n&offMask);
    }

    private static int switchON(int n, int i) {
        // OR with onMask
        // OnMask = Left Shifting 1 by i bits
        int onMask = 1<<i;
        return(n|onMask);
    }
}
