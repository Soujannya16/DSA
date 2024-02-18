package DPnRecursion.Recursion;

public class power {
    public static void main(String[] args) {
        int a=2,n=10; 
       System.out.println(powUnoptimised(a,n));
        System.out.println( powOptimised(a,n));
    }
    public static int powUnoptimised(int a, int n) { //n steps so O(n) tc
        //a^n=a^ n-1 * a
        
        if(n==0)
        return 1;
        
        return a*powUnoptimised(a, n-1);
    }
    public static int powOptimised(int a, int n) { //can be done if instead n-1 some more decreasing fun like n/2
        //a^n = a^ n/2 ^ 2 if even, odd a* that

        if(n==0)
        return 1;
        int x=powOptimised(a, n/2);

        if((n&1) == 1) // odd and 1 = last digit 1
        return a*x*x;

        return x*x;

        //o(logn) tc n sc
    }
}

