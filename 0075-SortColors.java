class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int mid =0;
        int high = nums.length-1;
        //based on dutch national flag algo
        while(mid <= high){
            //if the element we r at is zero, so we need to push it to the left side
            if(nums[mid] == 0){
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
