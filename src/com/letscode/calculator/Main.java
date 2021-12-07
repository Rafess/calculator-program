package com.letscode.calculator;
import java.util.Scanner;

import static utils.Printer.*;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        printQuestion();
        int firstNumber = Scan.nextInt();
        printQuestion();
        int secondNumber = Scan.nextInt();
       calculate(firstNumber, secondNumber);
    }
    public static void calculate(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
       print(sum, subtraction, multiplication, division);
    }
}
