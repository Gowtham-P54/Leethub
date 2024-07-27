class Solution {
    public int getSum(int a, int b) {
       if(a<0 || b<0)
       {
         while (b != 0)
          {
            int carry = a & b; // Compute carry bits
            a = a ^ b;         // Compute sum without carry
            b = carry << 1;    // Shift carry to next higher bit
        }
        return a;
       }
       else
       {
        for(int i=1;i<=b;i++)
        {
            a++;
        }
        return a;
       }
        
    }
}