public boolean posNeg(int a, int b, boolean negative) {
  boolean na = a < 0;
  boolean nb = b < 0;
  return negative ? na && nb : na ^ nb;
}
