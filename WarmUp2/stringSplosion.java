public String stringSplosion(String str) {
  String acc = "";
  for(int i = 1; i <= str.length(); i++)
  {
    acc += str.substring(0, i);
  }
  return acc;
}
