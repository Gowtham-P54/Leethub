class Solution {
    public String replaceDigits(String s) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                ans+=s.charAt(i);
            }
            else
            {
                int a=s.charAt(i)-'0';
                ans+=(char)(s.charAt(i-1)+a);
            }
        }
        return ans;
        
    }
}