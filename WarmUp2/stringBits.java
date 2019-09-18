public String stringBits(String str) {
  String acc = "";
  for(int i = 0; i < str.length(); i+=2)
  {
    acc += str.charAt(i);
  }
  return acc;
}
