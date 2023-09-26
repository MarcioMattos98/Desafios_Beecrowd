package desafiosbeecrowd;

import java.util.Scanner;

public class ConversaoDeTempo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempo = scan.nextInt();
        int cont, cont1;
        int horas = tempo / 3600;
        cont = tempo % 3600;
        int min = cont / 60;
        cont1 = cont % 60;
        System.out.println(horas + ":" + min + ":" + cont1);
        scan.close();
    }

}
