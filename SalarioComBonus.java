package desafiosbeecrowd;

import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        double salariofixo = scan.nextDouble();
        double vendas = scan.nextDouble();
        double comissao = salariofixo + (vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", comissao);
    }

}
