class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String str="";
        str+=x;
        List<Integer> li=new ArrayList<>();/// list.add(i)//list.remove(index)//list.get(i);
       for(int i=0;i<words.length;i++)
       {
       if(words[i].contains(str))
        li.add(i);
       }
       return li;
       
        
    }
}