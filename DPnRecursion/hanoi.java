package DPnRecursion;

public class hanoi {
    public static void main(String[] args) {
        int discs=4;

        char from_rod='a';
        char helper_rod='b';
        char to_rod='c';
        hanoiFun(discs,from_rod, helper_rod, to_rod);
    }
    public static void hanoiFun(int n, char a, char b, char c) {
        
        if(n==0)
        return;

        System.out.println(n + " from" + a +" to" + "c");
        hanoiFun(n-1, a,c,b);

     }
}
