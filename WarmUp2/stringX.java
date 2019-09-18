public String stringX(String str) {
  if(str.length() < 3)
  {
    return str;
  }
  String res = str.replace("x", "");
  if(str.charAt(0) == 'x')
  {
    res = 'x' + res;
  }
  if(str.charAt(str.length() - 1) == 'x')
  {
    res += 'x';
  }
  return res;
}
