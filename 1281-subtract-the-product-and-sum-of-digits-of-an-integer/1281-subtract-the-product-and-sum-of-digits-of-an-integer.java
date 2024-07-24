class Solution {
    public int subtractProductAndSum(int n) {
        int a=0;
        int b=1;
        int c=0;
        while(n>0)
        {
            a=n%10;
            b=a*b;
            c+=a;
            n=n/10;
        }
        return b-c;
        
    }
}