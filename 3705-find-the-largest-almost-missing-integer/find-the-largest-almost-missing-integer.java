import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

           
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            
            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        int answer = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                answer = Math.max(answer, entry.getKey());
            }
        }

        return answer;
    }
}