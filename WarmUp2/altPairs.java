public String altPairs(String str) {
  String acc = "";
  for(int i = 0; i < str.length(); i += 4)
  {
    acc += str.charAt(i);
    if(i + 1 < str.length())
    {
      acc += str.charAt(i + 1);
    }
  }
  return acc;
}
