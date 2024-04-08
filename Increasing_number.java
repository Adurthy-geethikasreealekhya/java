package java_kit;

import java.util.Scanner;


public class Increasing_number {
	public static boolean increasing(int n) {
		String str= Integer.toString(n);
		char digit;
		boolean flag = true;
		for(int i=0;i<str.length()-1;i++) {
		digit = str.charAt(i);
		if(digit > str.charAt(i+1)) {
			flag = false;
			break;
		}
		}
		return flag;
		
		}
	

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(increasing(n)) {
		System.out.println(n+ " is a increasing number");
	}
	else {
		System.out.println(n+ " is not a increasing number");
	}
}
}
