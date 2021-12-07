package com.letscode.calculator;
import static utils.Printer.print;

public class Main {
    public static void main(String[] args) {
       calculate(4, 2);
    }
    public static void calculate(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
       print(sum, subtraction, multiplication, division);
    }
}
