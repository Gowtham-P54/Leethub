class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
      List<String> li=new ArrayList<>();
      String sep="["+separator+"]";
      for(int i=0;i<words.size();i++)
      {
        String str[]=words.get(i).split(sep);
        for(int j=0;j<str.length;j++)
        {
            if(str[j].length()==0)
            {
                continue;
            }
            li.add(str[j]);
        }
      }
    return li;
    }
}