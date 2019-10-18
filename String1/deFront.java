public String deFront(String str) {
  if(str.charAt(0) != 'a')
  {
    str = str.substring(1, str.length());
    if(str.charAt(0) != 'b')
    {
      str = str.substring(1, str.length());
    }
  }
  else if(str.charAt(1) != 'b')
  {
    str = str.substring(0, 1) + str.substring(2, str.length());
  }
  return str;
}
