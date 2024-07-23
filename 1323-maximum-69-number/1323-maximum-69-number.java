class Solution {
    public int maximum69Number (int num) {
        String s1="";
        String str=Integer.toString(num);
        int i=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='6')
            {
                s1+='9';
                break;
            }
            s1+='9';
        }
        for(int j=i+1;j<str.length();j++)
        {
           s1+= str.charAt(j);
        }
        return Integer.parseInt(s1);
        
    }
}