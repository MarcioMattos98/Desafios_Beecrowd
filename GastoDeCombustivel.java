package desafiosbeecrowd;

import java.util.Scanner;

public class GastoDeCombustivel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempo = scan.nextDouble();
        double mediakm = scan.nextDouble();
        double media = (tempo * mediakm) / 12;
        System.out.printf("%.3f%n", media);
        scan.close();
    }

}
