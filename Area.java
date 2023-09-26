package desafiosbeecrowd;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A, B, C, area_t, area_tr, area_q, area_r, area_c, pi = 3.14159;
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        area_t = (A * C) / 2;
        area_c = pi * (Math.pow(C, 2));
        area_tr = ((A + B) * C) / 2;
        area_q = (B * B);
        area_r = (A * B);
        System.out.printf("TRIANGULO: %.3f%n", area_t);
        System.out.printf("CIRCULO: %.3f%n", area_c);
        System.out.printf("TRAPEZIO: %.3f%n", area_tr);
        System.out.printf("QUADRADO: %.3f%n", area_q);
        System.out.printf("RETANGULO: %.3f%n", area_r);
    }

}
