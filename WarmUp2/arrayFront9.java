public boolean arrayFront9(int[] nums) {
  int end = Math.min(nums.length, 4);
  for(int i = 0; i < end; i++)
  {
    if(nums[i] == 9)
    {
      return true;
    }
  }
  return false;
}
