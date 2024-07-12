class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x,b,c=0;
        while(x>0)
        {
            b=x%10;
            c=b+c;
            x=x/10;
        }
        if(a%c==0)
        {
            return c;
        }
        else
        {
            return -1;
        }
        
    }
}