package aula2.exercicios;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Escreva um programa em Java que solicita ao usuário um número inteiro e apresenta seu antecessor e sucessor.

public class Exercise1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = 0;

        boolean valido = false;
        while (!valido) {
            try {
                    System.out.print("Insert the a integer: ");
                    num = input.nextInt();
                    input.nextLine();
                    valido = true;
          
            } catch (InputMismatchException e) {
                System.out.println("The value typed is not a integer, try again.");
                input.nextLine();
            }
        }

        int predecessor = num - 1;
        int successor = num + 1;

        System.out.println("The predecessor of " + num + " is " + predecessor + " and his successor is " + successor);

    }
    
}
