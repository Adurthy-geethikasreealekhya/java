class Variables_Example1{
public static void main(String args[]){
int num1 = 12,num2 = 13,num3 = 11;
int result,sum_result,avg,sub_result,mul_result;
result = num1 + num2 + num3;
avg = result/3;
sum_result = num1 + num2 + num3;
sub_result = num1 - num2 - num3;
mul_result = num1 * num2 * num3;
System.out.println("Sum of three numbers is: " + sum_result);
System.out.println("Average of three numbers is: " + avg);
System.out.println("Subtraction of three numbers is: " + sub_result);
System.out.println("Multiplication of three numbers is: " + mul_result);
}
}