package parte_03;
import java.util.Scanner;
public class questao3 {

    static void Repeticao1(){
        System.out.println("Numeros de 100 a 1000: ");
        for(int i = 100; i <= 1000; i++){
            System.out.println(i);
        }
    }

    static void Repeticao2(){
        int soma = 0;

        for(int i = 100; i <= 1000; i++){
            soma += i;
        }
        System.out.println("A soma de 100 a 1000 e: " + soma);
    }

    static void Repeticao3(){
        System.out.println("Os numeros de 1 a 1000 multiplos de 7 sao: ");
        for(int i = 1; i <= 1000; i++){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }

    static void Repeticao4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero para calcular seu fatorial:");
        int num = sc.nextInt();
        int fat = 1;
        for (int i = 1;i <= num; i++){
            fat *= i;
        }
        System.out.println("O fatorial de " + num + " e: " + fat);
    }

    public static void main(String[] args){
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Insira a repeticao que deseja verificar (0 para sair): ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    Repeticao1();
                    break;

                case 2:
                    Repeticao2();
                    break;

                case 3:
                    Repeticao3();
                    break;

                case 4:
                    Repeticao4();
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
