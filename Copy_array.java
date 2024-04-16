package java_kit;

import java.util.*;
import java.lang.String;
public class Copy_array {
public static void main(String[] args) {
	int arr1[] = {12,4,6,3,5,7,33,9};
	int arr2[] = new int[arr1.length];
	int i;
	
	for( i=0;i<arr1.length;i++) { 
		arr2[i] = arr1[i];
	}
	

	System.out.println(" Contents of a: ");
	for(i=0;i<arr1.length;i++) 
		System.out.printf(arr1[i]+" ");
	System.out.println(" \nContents of b: ");
	for(i=0;i<arr2.length;i++) 
		System.out.printf(arr2[i]+" ");
	
	//System.out.println("Elements are: " + arr2);
}
}
