package desafiosbeecrowd;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int horas = scan.nextInt();
        float sal = scan.nextFloat();
        double salario = horas * sal;
        System.out.printf("NUMBER = %d%n", num);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }

}
