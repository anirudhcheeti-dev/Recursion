package Basics;

import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
    public static int print(int n){
        if(n==1){
            System.out.println(n);
            return n;
        }
        return print(n-1);
    }
}
