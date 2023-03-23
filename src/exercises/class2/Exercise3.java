package exercises.class2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// EEx03 - Crie um programa em Java que recebe como entrada o valor de uma compra e apresenta como saída o valor final com desconto e o desconto aplicado com base nas seguintes regras:

    // Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
    // Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
    // Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
    // Compras iguais ou superiores a R$ 500,00 - 15% de desconto

public class Exercise3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigDecimal valor = BigDecimal.ZERO;

        boolean valido = false;
        while (!valido) {
            System.out.print("Insert the purchase amount ");
            String valorStr = input.nextLine().replace(",", ".");
            if (valorStr.matches("^\\d+(\\.\\d{1,2})?$")) {
                valor = new BigDecimal(valorStr);
                int escala = valor.scale();
                if (escala < 2) {
                    valor = valor.setScale(2, RoundingMode.HALF_UP);
                } else if (escala > 2) {
                    valor = valor.setScale(2, RoundingMode.UNNECESSARY);
                }
                valido = true;
            } else {
                System.out.println("The value typed is invalid. Try again.");
            }
        }



        System.out.println("Value typed R$ " + valor);
        System.out.println("Value at a discount R$ " + aplicaDesconto(valor).setScale(2, RoundingMode.HALF_UP));
    }

    public static BigDecimal aplicaDesconto(BigDecimal valor){
        if (faixa1(valor)){
            return BigDecimal.valueOf(desconto1(valor));
        }
        if (faixa2(valor)){
            return BigDecimal.valueOf(desconto2(valor));
        }
        if (faixa3(valor)){
            return BigDecimal.valueOf(desconto3(valor));
        }
        return BigDecimal.valueOf(desconto4(valor));
    }

    public static double desconto1(BigDecimal valor){
        return valor.doubleValue() - valor.doubleValue()*0;
    }

    public static double desconto2(BigDecimal valor){
        return valor.doubleValue() - valor.doubleValue()*0.05;
    }

    public static double desconto3(BigDecimal valor){
        return valor.doubleValue() - valor.doubleValue()*0.10;
    }

    public static double desconto4(BigDecimal valor){
        return valor.doubleValue() - valor.doubleValue()*0.15;
    }

    public static boolean faixa1(BigDecimal valor){
        return valor.doubleValue() >= 0.01 && valor.doubleValue() <= 9.99;  
    }

    public static boolean faixa2(BigDecimal valor){
        return valor.doubleValue() >= 10.00 && valor.doubleValue() <= 99.99;  
    }

    public static boolean faixa3(BigDecimal valor){
        return valor.doubleValue() >= 100.00 && valor.doubleValue() <= 499.99;  
    }

    public static boolean faixa4(BigDecimal valor){
        return valor.doubleValue() >= 500.00;  
    }
    
    
}
