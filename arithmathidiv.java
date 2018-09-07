import java.util.*;
class Main {
  public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
 System.out.println("enter the first num");
int num1=sc.nextInt();
System.out.println("enter the sec num");
int num2=sc.nextInt();
    int div,add,sub,mul;
    div=num1/num2;
    add=num1+num2;
    sub=num1-num2;
    mul=num1*num2;
    System.out.println("addition of two numbers:"+add);
    System.out.println("division of two numbers:"+div);
    System.out.println("subtraction of two numbers:"+sub);
    System.out.println("multiplication of two numbers:"+mul);
  }
}