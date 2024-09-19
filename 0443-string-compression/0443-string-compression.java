class Solution {
    public int compress(char[] chars) {
        //String s="";
        if(chars.length==1)
        {
            return 1;
        }
        int count=1;
        ArrayList<Character> list=new ArrayList<>();
        int i=0;
        for(i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                count++;
            }
            else
            {
                list.add(chars[i]);
                if(count!=1)
                {

                
                if(count<=9)
                list.add((char)(count+'0'));
                else
                {
                    String s=count+"";
                    for(int k=0;k<s.length();k++)
                    {
                        list.add(s.charAt(k));
                    }
                }
                }
                count=1;
            }


        }
        list.add(chars[i]);
        if(count!=1)
        {
        if(count<=9)
                list.add((char)(count+'0'));
                else
                {
                    String s=count+"";
                    for(int k=0;k<s.length();k++)
                    {
                        list.add(s.charAt(k));
                    }
                }
        }

        for(int j=0;j<list.size();j++)
        {
            chars[j]=list.get(j);
        }
        return list.size();
    }
}