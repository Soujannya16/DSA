public class palindrome {
    public static void main(String[] args) {
        String s="ababa";
        System.out.println(pal( s,0,s.length()-1));
    }
    public static boolean pal(String s, int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)==s.charAt(j)){
            return pal(s, i+1, j-1);
        }
        else
        return false;
    }
}
