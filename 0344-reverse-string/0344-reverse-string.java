class Solution {
    public void reverseString(char[] s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length;i++)
        {
            ans.push(s[i]);
        }
        for(int i=0;i<s.length;i++)
        {
            s[i]=ans.pop();
        }
    }
}