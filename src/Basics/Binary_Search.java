package Basics;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[]{14,17,20,39,42,71,90,99};
        int ta=sc.nextInt();
        int ans=binarySearch(arr,ta,0,arr.length-1);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target, int left, int right){
        int mid=left+(right-left)/2;
        if(left>right){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr,target,left,mid-1);
        }
        return binarySearch(arr,target,mid+1,right);
    }
}
