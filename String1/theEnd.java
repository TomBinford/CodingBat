public String theEnd(String str, boolean front) {
  return Character.toString(front ? str.charAt(0) : str.charAt(str.length() - 1));
}
