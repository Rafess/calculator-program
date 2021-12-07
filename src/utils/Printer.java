package utils;
import com.letscode.calculator.Main;

import java.security.PublicKey;

public class Printer {
    public static void printer(String[] args) {

            }
    public static void print(int sumResult, int subtractionResult, int multResult, int divResult) {
        System.out.println(" A soma dos valores é " + sumResult);
        System.out.println(" A subtração dos valores é " + subtractionResult);
        System.out.println(" A multiplicação dos valores é " + multResult);
        System.out.println(" A divisão dos valores é " + divResult);
    }
    public static void printQuestion(){
        final String REQUEST_VALUE = "Insira um número:";
        System.out.print(REQUEST_VALUE);
    }
}
