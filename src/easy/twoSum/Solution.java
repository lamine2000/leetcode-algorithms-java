package easy.twoSum;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new java.util.HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i]))
                return new int[]{ hm.get(target - nums[i]), i };
            hm.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }
}