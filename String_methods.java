package java_kit;

import java.lang.String;
public class String_methods {
	public static void main(String[] args) {
		String s = " Alekhya";
		char res = s.charAt(5);//Returns the character at the specified index (position).
		System.out.println(res);
		
		int res1 = s.codePointAt(2);//Returns the Unicode of the character at the specified index
		System.out.println(res1);
		
		int res2 = s.codePointBefore(3);
		System.out.println(res2); //Returns the Unicode of the character before the specified index
		
		int res3 = s.codePointCount(0,3);
		System.out.println(res3); //Returns the number of Unicode values found in a string.
		
		String s1 = "Geethika";
		System.out.println(s.compareTo(s1));//Compares two strings lexicographically
		
		String s2 = "ALEKHYA";
		System.out.println(s.compareToIgnoreCase(s2));//Compares two strings lexicographically, ignoring case differences
		
		String firstName = "Satya ";
		String lastName = "Sai";
		System.out.println(firstName.concat(lastName));//Appends a string to the end of another string
		
		System.out.println(s.contains("Ale"));//Checks whether a string contains a sequence of characters
		System.out.println(s.contains("sree"));
		
		System.out.println(s.contentEquals("Alekhya"));
		System.out.println(s.contentEquals("alekhya"));//Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
		
		char[] s3 = {'A','l','e','k','h','y','a'};
		String s4 = " ";
		s4 = s4.copyValueOf(s3,0,4);//Returns a String that represents the characters of the character array
		System.out.println("Returned String: " + s4);
		
		System.out.println(s.endsWith("a"));//Checks whether a string ends with the specified character(s)
		System.out.println(s.endsWith("A"));
		
		System.out.println(s.equals(s2));//Compares two strings. Returns true if the strings are equal, and false if not
		System.out.println(s.equalsIgnoreCase(s2));//Compares two strings, ignoring case considerations
		
		String s5 = "ALEKHYA %s! times %d over all time.";
		String result = String.format(s5, "World", 1024);//Returns a formatted string using the specified locale, format string, and arguments
		System.out.println(result);
		
		byte[] res4 = s.getBytes();
		System.out.println(res4[3]);//The getBytes() method converts a string into an array of bytes.
		
		char arr[]= {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(arr);
		
		s1.getChars(2,7,arr,3);
		System.out.println(arr);//The getChars() method copies characters from a string to a char array.
		
		System.out.println(s.hashCode());//The hashCode() method returns the hash code of a string.
		
		System.out.println(s5.indexOf("times"));//The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
		
		System.out.println(s.isEmpty());//The isEmpty() method checks whether a string is empty or not.
		
		String color = String.join(" ","Orange","red");
		System.out.println(color);//The join() method joins one or more strings with a specified separator.
		
		System.out.println(s5.lastIndexOf("times"));//The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.
		
		System.out.println(s.length());//The length() method returns the length of a specified string.
		
		System.out.println(s.offsetByCodePoints(1,6));//The offsetByCodePoints() method returns an index in a string which is offset from another index by a specified number of code points.
		
		System.out.println(s.regionMatches(5,s1,3,2));//The regionMatches() method compares regions in two different strings to check if they are equal.
		
		System.out.println(s.replace('a', 'm'));//The replace() method searches a string for a specified character, and returns a new string where the specified character(s) are replaced.

		String regex = "time";
        System.out.println(s5.replaceAll(regex,"World"));//The replaceAll() method replaces the first match of a regular expression in a string with a new substring.
        
    	String rem = "%s";
    	System.out.println(s5.replaceFirst(rem , "can"));//The replaceFirst() method replaces the first match of a regular expression in a string with a new substring.
    	
    	String m = "[,\\.\\s]";
    	String[] arr1 = s5.split(m);
    	for(String i:arr1) {
    		System.out.println(i); //The split() method splits a string into an array of substrings using a regular expression as the separator.
    	}
    	
    	System.out.println(s.subSequence(3,6));//The subSequence() method returns a subsequence from the string as a CharSequence object.
    	
    	System.out.println(s.substring(3,6));//The substring() method returns a substring from the string.
    	
    	char[] arr2 = s.toCharArray();
    	System.out.println(arr2[3]);//The toCharArray() method returns a new char array representing the contents of the string.
    	
    	System.out.println(s.toUpperCase());//The toUpperCase() method converts a string to upper case letters.
    	System.out.println(s.toLowerCase());//The toLowerCase() method converts a string to lower case letters.
    	
    	System.out.println(s.toString());//The toString() method returns the string itself.
    	
    	System.out.println(s.trim());//The trim() method removes whitespace from both ends of a string.
    	
    	System.out.println(String.valueOf(s3));//The valueOf() method returns the string representation of the specified value.
	}

}
