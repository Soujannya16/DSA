public class sumOfDig {
    public static void main(String[] args) {
        System.out.println(digiSum(1234));
    }
    public static int digiSum(int n){
        if(n==0){
            return 0;
        }
        return digiSum(n/10) + n%10;
    }
}
