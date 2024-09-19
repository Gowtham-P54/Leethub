class Solution {
    public int compress(char[] chars) {
        List<Character>ans=new ArrayList<>();
        int count =1;
        int i=0;
        if(chars.length==1)
        {
            return 1;
        }
        for( i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                count++;
            }
            else
            {
                ans.add(chars[i]);
                if(count!=1)
                {
                    if(count<=9)
                    {
                        ans.add((char)(count+'0'));

                    }
                    else
                    {
                        String str=count+"";
                        for(int j=0;j<str.length();j++)
                        {
                            ans.add(str.charAt(j));
                        }
                    }
                
                }
                count=1;
            }
            
        
        }
          ans.add(chars[i]);
          if(count!=1)
                {
                   if(count<=9)
                    {
                        ans.add((char)(count+'0'));

                    }
                    else
                    {
                        String str=count+"";
                        for(int k=0;k<str.length();k++)
                        {
                            ans.add(str.charAt(k));
                        }
                    }
                }
        for(int k=0;k<ans.size();k++)
        {
             chars[k]=ans.get(k);
        }
        return ans.size();
        
    }
}