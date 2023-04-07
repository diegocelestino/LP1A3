package aula2.exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Ex04 - O código identificador de funcionários de uma empresa contém 7 caracteres, inicia com a sequência 
//de caracteres BR, em seguida apresenta um número inteiro entre 0001 e 9999 e finaliza com o caractere X. 

// Exemplos válidos:

//     BR0001X
//     BR1236X
//     BR9999X

// Exemplos inválidos:

//     br0001X
//     BR126X
//     BR99999X
//     BR9999Y

//     Avalie os métodos da classe String e Integer e identifique quais poderiam ser utilizados para validar todos os critérios do código identificador (Não utilizar expressões regulares) (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html  https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html)
//      Crie um programa em Java que solicita ao usuário um identificador e apresenta se o que foi informado é um valor válido ou inválido. 

public class Exercise4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String code = new String();

        System.out.print("Insert the id Code: ");
        code = input.next();

        testCode(code);

    }

    public static void testCode(String code){
        if(verifyDigitsQtd(code) && verifyBR(code) && verifyDigits(code)){
            System.out.println("Code is valid");
        } else {
            System.out.println("Code is invalid");
        }
    }

    public static boolean verifyDigitsQtd(String code){
        if (code.length() != 7){
            return false;
        }

        return true;
    }

    public static boolean verifyBR(String code){
        if(code.charAt(0) != 'B' || code.charAt(1) != 'R'){
            return false;
        }
        return true;
    }

    public static boolean verifyDigits(String code){
        try{
            Integer.valueOf(String.copyValueOf(code.toCharArray(), 2, 4));
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    public static boolean verifyX(String code){
        if(code.charAt(6) != 'X'){
            return false;
        }
        return true;
    }


    
}
