public int maxTriple(int[] nums) {
  int max = nums[0];
  max = Math.max(max, nums[nums.length / 2]);
  max = Math.max(max, nums[nums.length - 1]);
  return max;
}
