public boolean has271(int[] nums) {
  for(int i = 0; i < nums.length - 2; i++)
  {
    if(nums[i + 1] == nums[i] + 5)
    {
      int expected = nums[i] - 1;
      if(Math.abs(nums[i + 2] - expected) <= 2)
      {
        return true;
      }
    }
  }
  return false;
}
