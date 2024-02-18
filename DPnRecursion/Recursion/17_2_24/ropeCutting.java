public class ropeCutting {
    public static void main(String[] args) {
        System.out.println(cutAt(5, 4, 2, 6));
    }

    public static int cutAt(int n, int a, int b, int c) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 0;
        int max = cutAt(n - a, a, b, c) > cutAt(n - b, a, b, c)
                ? cutAt(n - a, a, b, c) > cutAt(n - c, a, b, c) ? cutAt(n - a, a, b, c) : cutAt(n - c, a, b, c)
                : cutAt(n - b, a, b, c);
        if (max == -1)
            return -1;
        return max + 1;
    }
}
