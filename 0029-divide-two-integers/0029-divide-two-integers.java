class Solution {
    public int divide(int dividend, int divisor) {
        int ans=0;
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        return Integer.MAX_VALUE;
        ans=dividend/divisor;
        return ans;
     
    }
}