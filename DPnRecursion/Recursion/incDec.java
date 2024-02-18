package DPnRecursion.Recursion;

public class incDec {
    public static void main(String[] args) {
        int n=5; //1,2,3,4,5
        printDecOrder(n);
        System.out.println("________________________");
        printIncOrder(n);
    }
    public static void printIncOrder(int n) {
        if(n==0)
        {
            //System.out.println(n);
            return;
        }
        printIncOrder(n-1);
        System.out.println(n);
        return ;
    }
    public static void printDecOrder(int n) {
        if(n==0)
        return;
        System.out.println(n);
        printDecOrder(n-1);
    }
}
