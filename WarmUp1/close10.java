public int close10(int a, int b) {
  int aDist = Math.abs(a - 10);
  int bDist = Math.abs(b - 10);
  return aDist == bDist ? 0 : (aDist < bDist ? a : b);
}
