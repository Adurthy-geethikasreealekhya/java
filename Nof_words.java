package java_kit;

import java.util.Scanner;
import java.lang.String;
public class Nof_words {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter statement: ");
	String str = sc.nextLine();
	
	String[] strar = str.split(" ");
	System.out.println("No.of Words: "+strar.length);
}
}
