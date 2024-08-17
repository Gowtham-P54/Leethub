class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[n*2];
        int k=0;
        for(int i=0;i<nums.length;i+=2)
        {
            arr[i]=nums[k++];
        }
        for(int j=1;j<nums.length;j+=2)
        {
            arr[j]=nums[k++];
        }
        return arr;

    }
}