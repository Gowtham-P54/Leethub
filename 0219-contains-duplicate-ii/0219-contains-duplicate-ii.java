class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(ans.containsKey(nums[i]))
            {
                if(Math.abs(ans.get(nums[i])-i)<=k)
                {
                    return true;
                }
                else
                {
                    ans.put(nums[i],i);
                }
            }
            else
            {
                ans.put(nums[i],i);
            }
        }
            return false;
    }
}