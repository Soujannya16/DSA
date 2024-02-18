import java.util.*;

class triplets{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,15};
        int t=18;
        tripFunc(a, t);
    }
    public static void tripFunc(int a[], int t) {
        
        Arrays.sort(a);

        int res=0;
        for(int i=0;i<a.length;i++)
        {
            res = res + a[i];
            int l=i+1, r=a.length-1;
            while(l<r)
            {
                if(res==t)
               { 
                System.out.println(a[i] + " " +a[l]+ " "+ a[r]);
               r--;
               l++;
            }

                else if(res<t)
                {
                    l++;
                }
                else
                r--;
            }
        }
    }

}