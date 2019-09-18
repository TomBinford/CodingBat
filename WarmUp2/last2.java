public int last2(String str) {
  if(str.length() < 3)
  {
    return 0;
  }
  String end2 = str.substring(str.length() - 2, str.length());
  int count = 0;
  for(int i = 0; i < str.length() - 2; i++)
  {
    if(str.substring(i, i + 2).equals(end2))
    {
      count++;
    }
  }
  return count;
}
