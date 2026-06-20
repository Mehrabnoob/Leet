//Leetcode problem 1. Two Sum
class Solution {
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){ //accessing first num

            for(int j=i+1; j<nums.length; j++){ //accessing 2nd num

                if(nums[i]+nums[j]==target){ //adding two nums
                    int ans[]={i,j};
                    return ans;
                }

            }


        }

        return nums;
    }
}
// This is the sample Main method, leetcode doesnt require a main method for this problem.
// public static void main(String[] args) {

//     int nums[] = { 2, 7, 11, 15 };
//     int target = 9;

//     Solution.twoSum(nums, target);

//     int[] result = Solution.twoSum(nums, target);
//     System.out.println(Arrays.toString(result));

// }
