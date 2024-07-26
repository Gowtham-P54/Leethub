class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
       for(int i=left;i<=right;i++){
        char first=words[i].charAt(0);
        char last=words[i].charAt(words[i].length()-1);
        if(isvowel(first)&&isvowel(last)){
           c++;
        }
       }
       return c;
    }
    
    boolean isvowel(char c)
    {
       char arr[]={'a','e','i','o','u'};
      
       for(int i=0;i<5;i++){
        if(arr[i]==c){
            return true;
        }
       }
       return false;
         
       
    }
}