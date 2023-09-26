package desafiosbeecrowd;

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        float Y = scan.nextFloat();
        float consumo = X / Y;
        System.out.printf("%.3f km/l%n", consumo);
        scan.close();
    }

}
