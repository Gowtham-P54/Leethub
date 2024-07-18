class Solution {
    public int scoreOfString(String s) {
        int[] arr=new int[s.length()];
        int sum=0;
     for(int i=0;i<s.length()-1;i++)
     {
        sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
     }   
     return sum;
    }
}