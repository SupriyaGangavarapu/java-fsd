package project1;

import java.util.Scanner;
public class ArithmeticCalculator {
    private double num1;
    private double num2;

    public ArithmeticCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1+num2;
    }

    public double subtract() {
        return num1-num2;
    }

    public double multiply() {
        return num1*num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1/num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        double num1,num2;
        Scanner sc = new Scanner (System.in);
        System.out.println("first number is:");
	num1=sc.nextDouble();
	System.out.println("second number is:");
	num2 = sc.nextDouble();
        ArithmeticCalculator calculator = new ArithmeticCalculator(num1, num2);
        double addition = calculator.add();
        System.out.println("Addition result: " + addition);
        double subtraction = calculator.subtract();
        System.out.println("Subtraction result: " + subtraction);
	double multiplication = calculator.multiply();
        System.out.println("Multiplication result: " + multiplication);
        double division = calculator.divide();
        System.out.println("Division result: " + division);
    }
}




