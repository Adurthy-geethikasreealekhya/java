package java_kit;
import java.util.*;
import java.util.Scanner;
public class Check_Number {
public static void main(String[] args) {
	int rem = 0;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number: ");
	int n = sc.nextInt();
	
	if((n & (n-1)) == 0) {
		System.out.println(n + " is a power of 2");
	}
	else {
		System.out.println(n + " is not a power of 2");
	}
	}

}
