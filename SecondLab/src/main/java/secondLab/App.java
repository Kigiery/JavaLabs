package secondLab;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("secondLab");
        while(true){
            System.out.println("1.+; 2.-; 3.*; 4./");
            int op = in.nextInt();
            System.out.println("Enter first number: ");
            int num1 = in.nextInt();
            System.out.println("Enter second number: ");
            int num2 = in.nextInt();
            switch (op){
                case 1:
                    Add add = (Add)context.getBean("add");
                    System.out.println("Result: "+add.operate(num1,num2));
                    break;
                case 2:
                    Subtract sub = (Subtract) context.getBean("subtract");
                    System.out.println("Result: "+sub.operate(num1,num2));
                    break;
                case 3:
                    Multiply mul = (Multiply)context.getBean("multiply");
                    System.out.println("Result: "+mul.operate(num1,num2));
                    break;
                case 4:
                    Divide divide = (Divide)context.getBean("divide");
                    System.out.println("Result: "+divide.operate(num1,num2));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + op);
            }
        }

    }
}
