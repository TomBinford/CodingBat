public String frontTimes(String str, int n) {
  String front = str.length() < 3 ? str : str.substring(0, 3);
  String acc = "";
  for(int i = 0; i < n; i++)
  {
    acc += front;
  }
  return acc;
}
