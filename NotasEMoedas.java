package desafiosbeecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotasEMoedas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if (n >= 0 && n <= 1000000.00) {
            int notas[] = {100, 50, 20, 10, 5, 2};
            double moedas[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
            System.out.println("NOTAS:");
            for (int i = 0; i < notas.length; i++) {
                int t = (int) (n / notas[i]);
                System.out.printf("%d nota(s) de R$ %.2f\n", t, (double) notas[i]);
                n = toDouble(n - notas[i] * t);
            }
            System.out.println("MOEDAS:");
            for (int i = 0; i < moedas.length; i++) {
                int t = (int) (n / moedas[i]);
                System.out.printf("%d moeda(s) de R$ %.2f\n", (int) (n / moedas[i]), moedas[i]);
                n = toDouble(n - moedas[i] * t);
            }
        }

    }

    private static double toDouble(double x) {
        DecimalFormat formato = new DecimalFormat("#0.00");
        return Double.valueOf(formato.format(x));
    }

}
