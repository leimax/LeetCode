package question1;

import java.util.HashMap;
import java.util.Map;

/*
 * PROBLEM: 两数之和等于目标值
 * BEFORE: hash
 */
public class Solution {
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = {1,8,7,4};
        int target = 5;
        int[] ints = Solution.twoSum(nums, target);

        for(int i : ints){
            System.out.println("[info]:"+i);
        }
    }

}