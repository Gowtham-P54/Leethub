class Solution {
    public int minimizedStringLength(String s) {
       int arr[]=new int[26];
       int count=0;
       for(int i=0;i<s.length();i++)
       {
      arr[s.charAt(i)-'a']++;
       }
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>=1)
        {
            count++;

        }
         }
          
          return count;
          }
}   