package exercises.class2;

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

public class ExerciseFour {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String code = new String();

        System.out.print("Insert the id Code: ");
        code = input.next();

        System.out.print(verifyBR(code));
        System.out.print(verifyDigit(code));

    }




    public static boolean verifyBR(String code){
        if (code.charAt(0) == 'B' && code.charAt(1) == 'R'){
            return true;
        }
        return false;
    }
    
    public static boolean verifyDigit(String code){
        try {
            char[] array = new char[3];
            for (int i = 2; i < 6; i++) {
                array[i - 2] = code.charAt(i);
             }
            String digit = array.toString();
            return Integer.parseInt(digit) >= 1 && Integer.parseInt(digit) <= 9999;
            
        } catch (InputMismatchException e) {
            System.out.println("The value typed is not a integer, try again.");
            return false;
        }
    }
}
