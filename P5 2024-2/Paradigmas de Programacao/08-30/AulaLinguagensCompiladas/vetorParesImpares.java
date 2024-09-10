// Faça um programa em java que recebe 6 numeros inteiros e mostre
// - Os numeros pares digitados
// - A soma dos numeros pares digitados
// - Os numeros ímpares digitados
// - A quantidade de numeros ímpares

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[6];
        int somaPar = 0;
        int qtdImpares = 0;
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();


        System.out.println("Digite 6 números inteiros: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            vetor[i] = sc.nextInt();
            if((vetor[i] % 2) == 0){
                somaPar += vetor[i];
                pares.add(vetor[i]);
            } else {
                qtdImpares++;
                impares.add(vetor[i]);
            }
        }
        System.out.println("1-) Exibe pares: " + pares);
        System.out.println("2-) Soma pares: " + somaPar);
        System.out.println("3-) Exibe ímpares: " + impares);
        System.out.println("4-) Qtd ímpares: " + qtdImpares);

    }
}
