public String startOz(String str) {
  String result = "";
  if(str.length() > 0)
  {
    if(str.charAt(0) == 'o')
    {
      result += 'o';
    }
    if(str.length() > 1)
    {
      if(str.charAt(1) == 'z')
      {
          result += 'z';
      }
    }
  }
  return result;
}
