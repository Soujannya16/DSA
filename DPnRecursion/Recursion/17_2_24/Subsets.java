public class Subsets {
    public static void main(String args[]) {
        String s = "ab";
        getSubset(s, "", s.length() - 1);
        System.out.println(numOfSubsets(s, "", s.length() - 1) + 1); // 1+ for empty string
    }

    public static void getSubset(String s, String subSet, int n) {

        if (n < 0) { // Sendnig length -1
            System.out.println(subSet);
            return;
        }

        getSubset(s, s.charAt(n) + subSet, n - 1);
        getSubset(s, subSet, n - 1);
    }

    public static int numOfSubsets(String s, String subSet, int n) {
        if (n < 0)
            return 0;

        return numOfSubsets(s, subSet + s.charAt(n), n - 1) + numOfSubsets(s, subSet, n - 1) + 1;
    }
}
