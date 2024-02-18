import java.util.*;
public class pairs{
    public static void main(String[] args) {
        int[] arr = {10,5,2,3,-6,9,11,};
        int s=4;

        pairFunc(arr,s);
    }
    public static void pairFunc(int a[], int s) {

        HashSet<Integer> h= new HashSet<Integer>();

        for(int i=0;i<a.length;i++)
        {
            int t= s-a[i];
            if(h.contains(s-a[i]))
            {
                System.out.println(a[i]+":"+t);
            }
            else
            {
                h.add(a[i]);
            }
        }


        /*
        wont work cuz output 10 -6, 2 2, -6 10
        for(int n : a)
        {
            h.add(n);
        }

        for(int i=0;i<a.length;i++)
        {
            int t= s-a[i];
            if(h.contains(s-a[i]))
            {
                System.out.println(a[i]+":"+t);
            }
        }*/
    }
}