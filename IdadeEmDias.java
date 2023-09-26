package desafiosbeecrowd;

import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
        int ano, mes, dia, cont, cont1;
        ano = idade / 365;
        cont = idade % 365;
        mes = cont / 30;
        cont1 = cont % 30;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(cont1 + " dia(s)");
        scan.close();
    }

}
