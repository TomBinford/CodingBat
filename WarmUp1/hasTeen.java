public boolean hasTeen(int a, int b, int c) {
  return teen(a) || teen(b) || teen(c);
}

boolean teen(int num)
{
  return 13 <= num && num <= 19;
}
