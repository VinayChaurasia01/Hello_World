import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        double num1, num2;
        System.out.println("Welcome to calculator");
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char operator = sc.next().charAt(0);
        double result = 0;
 
        switch (operator) {
        case '+':
            result = num1 + num2;
            break;
 
        case '-':
            result = num1 - num2;
            break;
 
        case '*':
            result = num1 * num2;
            break;
 
        case '/':
            result = num1 / num2;
            break;
 
        default:
            System.out.println("You enter wrong input");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
  }