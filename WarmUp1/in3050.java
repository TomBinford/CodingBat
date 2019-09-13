public boolean in3050(int a, int b) {
  return (inRange(a, 30, 40) && inRange(b, 30, 40)) || (inRange(a, 40, 50) && inRange(b, 40, 50));
}

boolean inRange(int n, int low, int high)
{
  return low <= n && n <= high;
}
