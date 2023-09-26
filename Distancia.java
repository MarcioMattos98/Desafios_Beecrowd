package desafiosbeecrowd;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int min = (60 * y) / 30;
        System.out.println(min + " minutos");
        scan.close();
    }

}
