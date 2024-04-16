package java_kit;


public class Ascending {
	void sort(int a[]) {
		int i = 0;
		int n = a.length;
		int min = i;
		int j;
		for(i = 0;i < n-1;i++) {
			for(j = i + 1;j < n;j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
		void printArray(int a[]) {
			int n = a.length;
			for(int i=0;i<n;i++) 
				System.out.print(a[i] + " ");
			System.out.println();
			
		
	}
public static void main(String[] args) {
	Ascending s = new Ascending();
	int a[] = {12,7,45,9,10,88,4,1};
	s.sort(a);
	System.out.println("Sorted Array");
	s.printArray(a);
}
}
