public String minCat(String a, String b) {
  if(a.length() < b.length())
  {
    b = b.substring(b.length() - a.length(), b.length());
  }
  else if(b.length() < a.length())
  {
    a = a.substring(a.length() - b.length(), a.length());
  }
  return a + b;
}
