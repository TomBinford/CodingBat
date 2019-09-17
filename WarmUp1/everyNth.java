public String everyNth(String str, int n) {
  String acc = "";
  for(int i = 0; i < str.length(); i += n)
  {
    acc += str.charAt(i);
  }
  return acc;
}
