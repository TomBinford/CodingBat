public String notString(String str) {
  return str.indexOf("not") == 0 ? str : "not " + str;
}
