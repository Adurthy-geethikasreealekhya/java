package java_kit;

import java.lang.String;
public class Endswith {
  public static void main(String args[]) {
	  String str = "Java Standard Edition";
	  System.out.println(str.endsWith("Edition"));
	  System.out.println(str.endsWith(""));
	  System.out.println(str.endsWith(" "));
  }
}
