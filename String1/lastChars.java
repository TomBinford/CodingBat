public String lastChars(String a, String b) {
  char aFirst = a.length() == 0 ? '@' : a.charAt(0);
  char bLast = b.length() == 0 ? '@' : b.charAt(b.length() - 1);
  return "" + aFirst + bLast;
}
