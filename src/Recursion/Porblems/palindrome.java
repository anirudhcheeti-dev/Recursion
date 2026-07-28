package Recursion.Porblems;

import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        String s = "gvffvg";
        helper(s);
        System.out.println(helper(s));
        return;
    }

    public static String helper(String s) {
//        if (s.length() <=3) return s;
//        int[] len=new int[26];
//            for(int i=0;i<len.length/2;i++){
//                len[s.charAt(i)-'a']++;
//            }
//            for(int i=0;i<26;i++){
//                if(len[i]!=0){}
//            }


        if (s.length() <= 3) return s;
        char[] arr = s.toCharArray();
        int i = 1;
        int j = arr.length - 2;
        while (i < j) {
            char ch = arr[i];
            char ch1=arr[i-1];
            if (ch < ch1) {
                char temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                char temp2 = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp2;
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}

