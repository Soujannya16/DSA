public class SubsetSum {
    public static void main(String[] args) {
        int a[] = { 10, 5, 2, 3, 6 };
        int sum = 8;
        int a2[] = { 10, 20, 15 };
        int sum2 = 0;
        System.out.println(getCount2(a2, sum2, a2.length - 1));
    }

    public static int getCount2(int[] a, int sum, int n) {
        // function to check if such a subset exists in the ending of the array, once
        // you get 1 it will return 1 except {8,4,4},8
        if (sum == 0)
            return 1;

        if (n < 0 || sum < 0)
            return 0;

        return getCount(a, sum, n - 1) + getCount(a, sum - a[n], n - 1);
    }

    public static int getCount(int[] a, int sum, int n) {
        // function to check if such a subset exists in the ending of the array, once
        // you get 1 it will return 1 except {8,4,4},8
        if (n == 0)
            return sum == 0 ? 1 : 0;

        int countRes = getCount(a, sum, n - 1) + getCount(a, sum - a[n], n - 1);
        return countRes;
    }

    // public static int getCount(int[] a, int sum, int n, int count) {
    // // function to check if such a subset exists in the ending of the array, once
    // // you get 1 it will return 1 except {8,4,4},8
    // if (sum < a[n] || n < 0)
    // return 0;
    // if (sum == a[n]) // not work for {8,8},8
    // return 1;
    // int countRes = getCount(a, sum, n - 1, count) + getCount(a, sum - a[n], n -
    // 1, count);
    // return countRes;
    // }
}
