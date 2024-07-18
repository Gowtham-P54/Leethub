class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String g="";
        for(int i=0;i<k;i++)
        {
           g+=str[i]+" ";
        }
        return g.trim();
    }
}