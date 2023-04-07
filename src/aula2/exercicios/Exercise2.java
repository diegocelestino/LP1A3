package aula2.exercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = 0;

        List<Integer> integers = new ArrayList<>();
        Integer sum = 0;

        boolean valido = false;
        System.out.println(!valido);

        while (integers.size() < 3) {
            try {
                    System.out.println("Insert the integer: ");
                    integers.add(input.nextInt());
                    input.nextLine();
          
            } catch (InputMismatchException e) {
                System.out.println("The value typed is not a integer, try again.");
                input.nextLine();
            }
        }

        System.out.print("The aritimetic medium of");
        for (Integer integer : integers) {
            System.out.print(" |" + integer + "| ");
            sum += integer;
        }

        System.out.println(" is = " + sum / 3);
        }

    
    
}
