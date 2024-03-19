package parte_02;

import java.util.Scanner;
public class questao2 {

    public static Scanner sc = new Scanner(System.in);

    static void condicional1(int num){
        if(num % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }
    }

    static void condicional2(int num){
        if(num % 7 == 0) {
            System.out.println("O numero e multiplo de 7.");
        } else {
            System.out.println("O numero nao e multiplo de 7.");
        }
    }

    static void condicional3(int nota){
        if(nota >= 60){
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno nao foi aprovado.");
        }
    }

    static void condicional4(int nota){
        if (nota >= 90) {
            System.out.println("O conceito foi A.");
        } else if (nota >= 80) {
            System.out.println("O conceito foi B.");
        } else if (nota >= 70) {
            System.out.println("O conceito foi C.");
        } else if (nota >= 60) {
            System.out.println("O conceito foi D.");
        } else if (nota >= 40) {
            System.out.println("O conceito foi E.");
        } else {
            System.out.println("O conceito foi F.");
        }
    }

    static void condicional5(int num1, int num2){
        if (num1 > num2) {
            System.out.println("O numero " + num1 + " e maior");
        } else if (num2 > num1) {
            System.out.println("O numero " + num2 + " e maior");
        } else {
            System.out.println("Os numeros sao iguais");
        }
    }
    public static void main(String[] args){
        int opcao, num;

        do {
            System.out.println("Insira a condicional que deseja verificar (0 para sair): ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Insira um numero para verificar se e par ou impar:");
                    num = sc.nextInt();
                    condicional1(num);
                    break;

                case 2:
                    System.out.println("Insira um numero para verificar se e multiplo de 7:");
                    num = sc.nextInt();
                    condicional2(num);
                    break;

                case 3:
                    System.out.println("Insira a nota do aluno para verificar se foi aprovado:");
                    num = sc.nextInt();
                    condicional3(num);
                    break;

                case 4:
                    System.out.println("Insira a nota do aluno para verificar seu conceito");
                    num = sc.nextInt();
                    condicional4(num);
                    break;

                case 5:
                    System.out.println("Insira dois numeros para verificar qual e o maior:");
                    num = sc.nextInt();
                    int num2 = sc.nextInt();
                    condicional5(num, num2);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while(opcao != 0);
    }

}
