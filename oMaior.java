package desafiosbeecrowd;

import java.util.Scanner;

public class oMaior {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int maior_ab = (A + B + (Math.abs(A - B))) / 2;
        int maior_abc = (maior_ab + C + (Math.abs(maior_ab - C))) / 2;
        System.out.println(maior_abc + " eh o maior");
    }

}
