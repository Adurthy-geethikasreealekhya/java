package java_kit;

public class Square_matrix {
	
public static void main(String args[]) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int i,j;
	
	for(i = 0;i < a.length;i++) {
		for(j = 0;j < a.length;j++) {
			a[i][j] = a[i][j] * a[i][j];
		}
	}
	for(i = 0;i < a.length;i++) {
		for(j = 0;j < a.length;j++) {
			System.out.println(a[i][j] + " ");
		}
		System.out.println();
	}
}

}
