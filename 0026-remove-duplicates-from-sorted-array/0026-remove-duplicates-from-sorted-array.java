class Solution {
    public int removeDuplicates(int[] nums) {
        // The first element is always unique
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            // Found a new unique number (different from the previous one)
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }

        // insertIndex equals the total count of unique elements (k)
        return insertIndex;
    }
}