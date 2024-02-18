import java.util.HashSet;

public class longestBand {
    public static void main(String[] args) {
        int a[]={1,9,3,0,18,5,2,4,10,7,12,6};
        System.out.println( longestBandFunc(a));
    }
    public static int longestBandFunc(int a[]) {

        HashSet<Integer> h=new HashSet<>();

        for(int n:a)
        {
            h.add(n);
        }

        int c=0, res=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(h.contains(a[i]-1))
            continue;
            else
            {
                c=1;
                System.out.println(a[i]);
                while(h.contains(++a[i])) //a[i]++ wont work cuz counting if 9 present again
                {
                    c++;
                }
                System.out.println(a[i]+ "/"+ c);
                if(c>res)
                res=c;
            }
        }
        return res;
    }
}
