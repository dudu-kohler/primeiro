
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TI
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dinheiro;
        double dolar = 5,45;
        double result;
        System.out.println("quanto voce possui? ");
        dinheiro = teclado.nextDouble();
        result = dinheiro / dolar;
        System.out.println(result);
    
    }
}