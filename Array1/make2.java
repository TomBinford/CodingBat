public int[] make2(int[] a, int[] b) {
  int[] res = new int[2];
  for(int i = 0; i < a.length && i < 2; i++)
  {
    res[i] = a[i];
  }
  for(int i = a.length; i < 2; i++)
  {
    res[i] = b[i - a.length];
  }
  return res;
}
