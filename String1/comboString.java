public String comboString(String a, String b) {
  boolean aShort = a.length() < b.length();
  String s = aShort ? a : b;
  String l = aShort ? b : a;
  return s + l + s;
}
