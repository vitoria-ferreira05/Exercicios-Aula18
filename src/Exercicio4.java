import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //4. Peça ao usuário dois números e exiba em ordem decrescente
        //(suponha números diferentes).

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[2];

        System.out.println("Digite os números: ");

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("Ordem descrescente dos numeros digitados: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Ordem descrescente dos numeros digitados: " + numero2 + ", " + numero1);
        }

    }
}

