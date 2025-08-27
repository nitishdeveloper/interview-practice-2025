package DSA;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = solution(new int[]{2, 7, 11, 15}, 9);
        Arrays.stream(result).forEach(System.out::print);
    }

    private static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
