public String atFirst(String str) {
  int len = str.length();
  for(int i = 0; i < 2 - len; i++)
  {
    str += '@';
  }
  return str.substring(0, 2);
}
