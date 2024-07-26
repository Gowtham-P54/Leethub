class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(fun(i)){
                list.add(i);
            }
            
        }
        return list;
        
    }
    boolean fun(int n){
        int temp=n;
       while(n!=0)
            {
                int rem=n%10;
                if(rem==0 || temp%rem!=0)
                {
                   return false;
                }
                 n=n/10;
            }
            return true;
    }
}