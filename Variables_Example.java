import java.util.Scanner;
class Variables_Example{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Number1: ");
int num1 = sc.nextInt();
System.out.println("Enter Number2: ");
int num2 = sc.nextInt();

if(num1 == num2){
System.out.println(num1 + " and " + num2 +" values are Equal");
}
else{
System.out.println(num1 + " and " + num2 +" values are not Equal");
}
}
} 