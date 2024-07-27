class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums1[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
           nums1[i]=nums[i];
        }
        int k=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            nums1[k++]=nums[i];
        }
        return nums1;



        
    }
}