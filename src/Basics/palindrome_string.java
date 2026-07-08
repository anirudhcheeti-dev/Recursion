package Basics;

public class palindrome_string {
    static void main() {
        String s="madamadamadam";
        boolean a=isPalindrome(s,0,s.length()-1);
        System.out.println(a);
    }
    public static boolean isPalindrome(String s, int start, int end){
        if(start>=end)return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return isPalindrome(s,start+1,end-1);
    }
}
