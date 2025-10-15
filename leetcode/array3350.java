class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int pre = 0, cur = 1, res = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                cur++; 
            } else {
               
                res = Math.max(res, Math.min(pre, cur));
                res = Math.max(res, cur / 2);
                pre = cur;
                cur = 1;
            }
        }

        
        res = Math.max(res, Math.min(pre, cur));
        res = Math.max(res, cur / 2);

        return res;
    }
}
