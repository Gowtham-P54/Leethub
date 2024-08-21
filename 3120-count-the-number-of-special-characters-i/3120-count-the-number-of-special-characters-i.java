class Solution {
    public int numberOfSpecialChars(String word) {
        int low[]=new int[26];
        int upp[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>=97)
            low[word.charAt(i)-97]++;
            else
            {
                upp[word.charAt(i)-65]++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(low[i]>0 && upp[i]>0)
            {
                count++;
            }
        }
        return count;
        
    }
}