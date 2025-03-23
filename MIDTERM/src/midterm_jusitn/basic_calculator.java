package midterm;

import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean u = true;
        while (u){
            
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        if (op == '+') result = num1 + num2;
        else if (op == '-') result = num1 - num2;
        else if (op == '*') result = num1 * num2;
        else if (op == '/') result = num2 != 0 ? num1 / num2 : Double.NaN;
        else System.out.println("Invalid operator!");

        System.out.println("Result: " + result);
        }
    }
}
