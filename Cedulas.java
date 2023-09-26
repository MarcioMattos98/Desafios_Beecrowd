package desafiosbeecrowd;

import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        int quantidade;
        System.out.println(valor);
        if (valor > 0) {

            quantidade = valor / 100;
            System.out.println(quantidade + " nota(s) de R$ 100,00");
            valor = valor % 100;
            quantidade = valor / 50;
            System.out.println(quantidade + " nota(s) de R$ 50,00");
            valor = valor % 50;
            quantidade = valor / 20;
            System.out.println(quantidade + " nota(s) de R$ 20,00");
            valor = valor % 20;
            quantidade = valor / 10;
            System.out.println(quantidade + " nota(s) de R$ 10,00");
            valor = valor % 10;
            quantidade = valor / 5;
            System.out.println(quantidade + " nota(s) de R$ 5,00");
            valor = valor % 5;
            quantidade = valor / 2;
            System.out.println(quantidade + " nota(s) de R$ 2,00");
            valor = valor % 2;
            quantidade = valor;
            System.out.println(quantidade + " nota(s) de R$ 1,00");
        }
        scan.close();
    }

}
