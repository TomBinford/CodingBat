public boolean icyHot(int temp1, int temp2) {
  return Math.min(temp1, temp2) < 0 && Math.max(temp1, temp2) > 100;
}
