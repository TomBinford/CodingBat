public boolean loneTeen(int a, int b) {
  return teen(a) ^ teen(b);
}

boolean teen(int n)
{
  return 13 <= n && n <= 19;
}
