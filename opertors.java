import java.util.Scanner;
public class opertors {
public static Void main(String[] args)
{
int a = 10;
int b = 5;
int c = a + b;
System.out.println(c);
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int a = sc.nextInt();
System.out.println("enter second number:");
int b = sc.nextInt();
System.out.println("AND:"+(a&b));
System.out.println("or:"+(a|b));
System.out.println("Xor:"+(a^b));
}}