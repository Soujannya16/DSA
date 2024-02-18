package DPnRecursion.Recursion;

public class countStrings {
//coutn no of binary strings with no consecutive ones thea tcan be formed using a binary string of length n
    public static void main(String[] args) {
        int n=4;

        System.out.println(countFunc(n));
    }
    public static int countFunc(int n) {
        if(n==0)
        return 1;
        if (n==1) {
            return 2;
        }

        return countFunc(n-2)+countFunc(n-1);   //10 n-2   +  0 n-1
        
    }
}
