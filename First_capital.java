package java_kit;

import java.lang.String;
public class First_capital {
public static void main(String[] args) {
	String s = "i am learning java in odigos";
	 
	String[] arr = s.split(" ");
	for(int i=0;i<arr.length;i++) {
		
		char c = arr[i].charAt(0);
		String c1 = String.valueOf(c).toUpperCase();
		String sub = arr[i].substring(1);
		System.out.print(c1+sub + " ");
	}
}
}
