package DPnRecursion.Recursion;

public class sortedArray {
    public static void main(String[] args) {
        int[] a={1,2,3,5,4,6};
        System.out.println(sortedOrNot(a, a.length)); // 1 is sorted, 0 not sorted
    }
    public static int sortedOrNot(int[] a, int n) {
        if(n==1 || n==0)
        return 1;
        else
        {
            if(a[n-1]>=a[n-2])
            return sortedOrNot(a, n-1);
            else
            return 0;
        }
    }
}
