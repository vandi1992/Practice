package Topics.Recursion;

import static java.util.Collections.swap;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a=new int[] {7,8,9,10,11};
        int[] swappedArr = swapArray(0,a.length-1,a);

        for(int i :swappedArr){
            System.out.println(i);
        }
    }

    private static int[] swapArray(int left, int right, int[] a) {
        if(left<right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            swapArray(left + 1, right - 1, a);

        }
        return a;
    }
}
