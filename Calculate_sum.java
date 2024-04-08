package java_kit;

public class Calculate_sum {
	
public static void main(String args[]) {
	int n = 100;
	int i,sum=0;
	
	for(i = 1;i <= n;i++) {
		if(i%3 == 0 || i%5 == 0) {
			sum += i;
		}
	}
	System.out.println("sum of numbers divisible by 3 or 5 are: " + sum);
}
}
