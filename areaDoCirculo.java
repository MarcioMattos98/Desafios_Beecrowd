
package desafiosbeecrowd;

import java.util.Scanner;


public class areaDoCirculo {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14159;
        double raio = scan.nextDouble();
        double area;
        area = pi * Math.pow(raio,2);
        System.out.printf("A=%.4f\n",area);
    }
    
}
