package parte_02;


public class questao2 {

    import java.util.Scanner;
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
            opcao = next.Int();

            switch(opcao) {
                case 1:
                    num = next.Int();
                    condicional1(num);
                    break;

                case 2:
                    num = next.Int();
                    condicional2(num);
                    break;

                case 3:
                    num = next.Int();
                    condicional3(num);
                    break;

                case 4:
                    num = next.Int();
                    condicional4(num);
                    break;

                case 5:
                    num = next.Int();
                    int num2 = next.Int();
                    condicional5(num, num2);
                    break;

                case 0:
                    break;
            }
        } while(opcao != 0);
    }

}
