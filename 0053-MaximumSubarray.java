class Solution {
    int sum =0;
    int max = Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
