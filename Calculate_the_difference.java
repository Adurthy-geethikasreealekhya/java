package java_kit;

import java.util.*;

public class Calculate_the_difference {
	public static int calculateDifference(int n) {
		int x = (n * (n + 1) * (2 * n + 1)) / 6;
		int y = (n * (n + 1)) / 2;
		int m = y * y;
		int z = Math.abs(x - m);
		return z;
	}

	public static void main(String[] args) {
		int result = Calculate_the_difference.calculateDifference(10);
		System.out.println("Result: " + result);
	}
}
