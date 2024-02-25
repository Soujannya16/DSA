public class CheckSeq {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5 };
        for (int i = 1; i < n.length; i++) {
            if (n[i - 1] + 1 == n[i])
                continue;
            else
                System.out.println("false from iteration");
        }
        System.out.println("true from iteration");

        System.out.println(isSequence(n, 1));
    }

    public static boolean isSequence(int[] a, int i) {
        if (a[i - 1] + 1 != a[i])
            return false;

        if (i == a.length - 1)
            return true;

        return isSequence(a, i + 1);
    }
}
