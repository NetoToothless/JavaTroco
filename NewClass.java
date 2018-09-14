
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class NewClass {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        float b = tcl.nextFloat();
        int moedas[] = new int[12];
        int a = (int) Math.ceil((b * 100));

        moedas[0] = (int) (a / 10000);

        a = a % 10000;

        moedas[1] = (int) (a / 5000);

        a = a % 5000;

        moedas[2] = (int) (a / 2000);

        a = a % 2000;

        moedas[3] = (int) (a / 1000);
        a = a % 1000;

        moedas[4] = (int) (a / 500);
        a = a % 500;
        moedas[5] = (int) (a / 200);
        a = a % 200;
        moedas[6] = (int) (a / 100);
        a = a % 100;
        moedas[7] = (int) (a / 50);
        a = a % 50;

        moedas[8] = (int) (a / 25);
        a = a % 25;

        moedas[9] = (int) (a / 10);
        a = a % 10;

        moedas[10] = (int) (a / 5);
        a = a % 5;

        System.out.println("Contem : " + moedas[0] + " Cédulas de R$ 100,00;");
        System.out.println("Contem : " + moedas[1] + " Cédulas de R$ 50,00;");
        System.out.println("Contem : " + moedas[2] + " Cédulas de R$ 20,00;");
        System.out.println("Contem : " + moedas[3] + " Cédulas de R$ 10,00;");
        System.out.println("Contem : " + moedas[4] + " Cédulas de R$ 5,00;");
        System.out.println("Contem : " + moedas[5] + " Cédulas de R$ 2,00;");
        System.out.println("Contem : " + moedas[6] + " Cédulas de R$ 1,00;");
        System.out.println("Contem : " + moedas[7] + " Moedas de R$ 0,50;");
        System.out.println("Contem : " + moedas[8] + " Moedas de R$ 0,25;");
        System.out.println("Contem : " + moedas[9] + " Moedas de R$ 0,10;");
        System.out.println("Contem : " + moedas[10] + " Moedas de R$ 0,05;");
        System.out.println("Contem : " + a + " Moedas de R$ 0,01;");

    }
}
