
package boletin2_9;

import java.util.Scanner;

public class Boletin2_9 {

    public static void main(String[] args) {
        int euros, b100, b20, b5, b1, resto1, resto2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad total en euros");
        euros = sc.nextInt();
        b100 = euros/100;
        resto1 = euros%100;
        b20 = euros%100/20;
        resto2 = resto1%20;
        b5 = ((euros%100)%20)/5;
        b1 = euros%100%20%5;
        System.out.println(b100 + " billetes de 100");
        System.out.println(b20 + " billetes de 20");
        System.out.println(b5 + " billetes de 5");
        System.out.println(b1 + " monedas");
    }
    
}
