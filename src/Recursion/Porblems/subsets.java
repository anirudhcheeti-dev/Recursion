package Recursion.Porblems;
public class subsets {
    public static void main() {
         subsets1("", "abc");
    }
    static void subsets1(String p,String q) {
        if(q.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = q.charAt(0);
        subsets1(p+ch,q.substring(1));
        subsets1(p,q.substring(1));
     }
}
