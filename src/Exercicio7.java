
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TI
 */
public class Exercicio7 {
    public static void main(String[] args) {
        float numero;
        float dobro;
        float terça;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        numero = teclado.nextFloat();
        dobro = numero *2;
        System.out.println("O dobro de seu numero e: " + dobro);
        terça = numero /3;
        System.out.println("A terca parte de seu numero e: " + terça);
        
        
    }
    }
