public int max1020(int a, int b) {
  boolean aRange = 10 <= a && a <= 20;
  boolean bRange = 10 <= b && b <= 20;
  if(aRange)
  {
    if(bRange)
      return Math.max(a, b);
    else
      return a;
  }
  else if(bRange)
  {
    return b;
  }
  else
  {
    return 0;
  }
}
