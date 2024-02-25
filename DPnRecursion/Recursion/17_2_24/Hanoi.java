public class Hanoi {
    public static void main(String[] args) {
        int discs = 4;
        hanoi(discs, 'a', 'b', 'c');
    }

    public static void hanoi(int n, char source, char using, char des) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from rod " + source + " to rod " + des);
            return;
        }

        // if (n == 2) {
        // System.out.println("Move disk " + n + " from rod " + source + " to rod " +
        // using);
        // System.out.println("Move disk " + (n - 1) + " from rod " + source + " to rod
        // " + des);
        // System.out.println("Move disk " + n + " from rod " + using + " to rod " +
        // des);
        // return;
        // }
        hanoi(n - 1, source, des, using);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + des);
        hanoi(n - 1, using, source, des);

    }
}
