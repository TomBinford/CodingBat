public int sum2(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length && i < 2; i++)
  {
    sum += nums[i];
  }
  return sum;
}
