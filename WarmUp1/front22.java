public String front22(String str) {
  String first = str.length() < 2 ? str : str.substring(0, 2);
  return first + str + first;
}
