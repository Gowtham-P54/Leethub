class Solution {
    public String reverseWords(String s) {
        String str=" ";
        String st[]=s.split(" ");
        for(int i=0;i<st.length;i++)
        {
            for(int j=st[i].length()-1;j>=0;j--)
            {
                str+=st[i].charAt(j);
            }
            str+=" ";
        }
        return str.trim();
        
    }
}