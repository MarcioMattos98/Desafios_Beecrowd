package desafiosbeecrowd;

import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float raio = scan.nextFloat();
        double pi = 3.14159;
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
    }

}
