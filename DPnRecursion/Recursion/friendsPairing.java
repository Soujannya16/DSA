package DPnRecursion.Recursion;

public class friendsPairing {
//each can go alone or in pair, how many ways
    public static void main(String[] args) {
        int n=3;

        System.out.println(friendsPairingFun(n));
    }
    public static int friendsPairingFun(int n) {
        if(n<2)
        return 1;

        return 1*friendsPairingFun(n-1) + (n-1)*friendsPairingFun(n-2);
        //one way can go alone * rest n-1 people go in f(n-1) way....or can go in couple, choose one to couple with in (n-1) ways and(*) rest (n-2) people in f(n-2) ways
       // wrong return n - 2 + friendsPairingFun(n-1);
        
    }
}
//backtrackin, graph