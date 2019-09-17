public String delDel(String str) {
  if(str.indexOf("del") == 1)
  {
    return str.charAt(0) + str.substring(4);
  }
  else
  {
    return str;
  }
}
