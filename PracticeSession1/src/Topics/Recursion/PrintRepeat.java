package Topics.Recursion;

//Print name 5 times.
// TC = O(n) , SC = O(n)
public class PrintRepeat {

    public static void main(String[] args) {
        String name ="Vandi";
        printName(name,5);
    }

    private static void printName(String name, int i) {
        if(i>0){
            System.out.println(name);
        }
        else{
            return;
        }
        printName(name,i-1);
    }
}
