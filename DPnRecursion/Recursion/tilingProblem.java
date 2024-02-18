package DPnRecursion.Recursion;

public class tilingProblem {
    public static void main(String[] args) {
        //4*n board filled up with 4*1 or 1*4 tiles, how many ways?
        int n=7;
        System.out.println(numOfWays(4, n));
    }
    public static int numOfWays(int b, int n) {
        
        if(n<=3) //n!=0 as n=0 1way,n=1 1way, n=2 1way, n=3 1way, n=4 >1way
        return 1;

        return  numOfWays(b, n-1) + numOfWays(b, n-4);

    }
}
