package java_kit;

public class Sum_Avg {
	
	public static void main(String[] args) {
		
		int[] arr = { 3, 5, 7, 3 };
		int sum = 0;
		double avg;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum: " + sum);
		avg = (double)sum / arr.length;
		System.out.println("Average: " + avg);
	}
}
