public String lastTwo(String str) {
  String first = str.length() > 2 ? str.substring(0, str.length() - 2) : "";
  String secondToLast = str.length() > 1 ? Character.toString(str.charAt(str.length() - 2)) : "";
  String last = str.length() > 0 ? Character.toString(str.charAt(str.length() - 1)) : "";
  return first + last + secondToLast;
}
