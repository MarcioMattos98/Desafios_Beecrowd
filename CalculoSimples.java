package desafiosbeecrowd;

import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cod1 = scan.nextInt();
        int numpeca1 = scan.nextInt();
        double valor1 = scan.nextDouble();
        int cod2 = scan.nextInt();
        int numpeca2 = scan.nextInt();
        double valor2 = scan.nextDouble();
        double valorpagar = ((numpeca1 * valor1) + (numpeca2 * valor2));
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorpagar);
    }

}
