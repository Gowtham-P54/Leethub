class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            Stack<Character> ans=new Stack<>();
            for(int j=0;j<words[i].length();j++)
            {
                ans.push(words[i].charAt(j));
            }
            int b=0;
            while(!ans.isEmpty())
            {
                if(ans.pop()==words[i].charAt(b++))
                continue;
                else
                break;
            }
            if(ans.isEmpty())
            return words[i];
        }
        return "";
        
    }
}