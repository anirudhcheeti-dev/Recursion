package Recursion.Porblems;

import java.util.ArrayList;

public class Elimination390 {
    public static void main() {
        int n = 9;
        Solution sol = new Solution();
        sol.lastRemaining(n);
    }
}
    class Solution {
        public int lastRemaining(int n) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1;i<=n;i++) {
                list.add(i);
            }
            int st=0;
            return helper(st,list,list.size()-1);
        }
        public int helper(int st,ArrayList<Integer> list,int i){
            if(i==1) return list.get(i);
            else{
                if(st<i){
                    list.remove(st);
                    helper(st+2,list,i);
                }else{
                    st=i;
                    list.remove(st);
                    helper(st-2,list,i);
                }
            }
            return helper(st+1,list,i);
        }
    }
