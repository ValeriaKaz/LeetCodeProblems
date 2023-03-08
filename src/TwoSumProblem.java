import java.util.Arrays;

/*Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
----------------------------
Approach
1) Take one element.
2) Add this element with every other element.
3) After adding, compare the sum with the given target.
4) If the sum is equal to the target, return the indices of these two elements.
5) If the sum is not equal to the target, we check for the next pair.
*/
public class TwoSumProblem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{11, 7, 2, 15}, 9))); // [1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6))); // [1,2]
        System.out.println(Arrays.toString(twoSum2(new int[]{3, 3}, 6))); // [0,1]
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 3, 3}, 6))); // [1,2]
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[0];
        outer:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) j++;
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result = new int[]{i, j};
                    break outer;
                }
            }
        }
        return result;
    }

    // another way to solve the problem (better than the first)
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j - i] + nums[j] == target) {
                    return new int[]{j - i, j};
                }
            }
        }
        return null;
    }
}
