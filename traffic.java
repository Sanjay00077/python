import java.util.Scanner;
class traffic {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter signal (R/Y/G):");
char signal = sc.next().charAt(0);
switch(signal)
{
case 'R':
System.out.println("stop");
break;
case 'Y':
System.out.println("ready");
break;
case 'G':
System.out.println("go");
break;
default:
System.out.println("invalid signal kumaru");
}
}
}  