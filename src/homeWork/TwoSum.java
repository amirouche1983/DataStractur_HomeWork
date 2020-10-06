package homeWork;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {34, 50, 20, 60, 7, 8, 15};
        int target = 65;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        int[] numbers = {7, 5, 0, 8, 1, 13, 9, 10};
        int target1 = 20;
        System.out.println(Arrays.toString(twoSum1(numbers, target1)));

    }

    public static int[] twoSum(int nums[], int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                return result;

            } else
                map.put(nums[i], i);
        }
        return result;
    }

    public static int[] twoSum1(int[] numbers, int target1) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] == target1 - numbers[i]) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

}



