package Recursion.Porblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class palindrome {
    public static void main(String[] args) {
        String s = "gvfgfvg";
        helper(s);
        System.out.println(helper(s));
        return;
    }

    public static String helper(String s) {
        ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < s.length() / 2; i++) {
                list.add(s.charAt(i));
            }
            Collections.sort(list);
            ArrayList<Character> list2 = new ArrayList<>(list);
            Collections.reverse(list2);

            StringBuilder sb = new StringBuilder();

        for (char ch : list) {
            sb.append(ch);
        }
        if(s.length()%2!=0){
            sb.append(s.charAt(s.length()/2));
        }
        for(char ch : list2){
            sb.append(ch);
        }
        return sb.toString();
    }
}

