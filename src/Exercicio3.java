import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Faça um programa que contenha um método que receba o tamanho
        //de uma lista como parâmetro e que retorne a lista com a capacidade
        //inicial recebida pelo usuário. Logo depois faça um método que adicione
        //valores nessa lista, os valores devem ser recebidos pelo usuário
        //respeitando a capacidade inicial além disso esse método deve retornar
        //true caso a adição seja bem sucedida e false caso o contrário. Por fim
        //um método que retorna a média aritmética dos números armazenados
        //na lista.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int tamanhoLista = sc.nextInt();

        System.out.println("Digite valores que serao adicionados na lista: ");
        for (int i = 0; i < tamanhoLista; i++) {
            int valores = sc.nextInt();
        }
    }

    public static List<Integer> listaCapacidadeInicial(int tamanhoLista) {
        List<Integer> lista = new ArrayList<>(tamanhoLista);
        return lista;
    }

    public static List<Integer> adicionandoValoresNaLista(int valores) {

        List<Integer> listaAdicionados = new ArrayList<>(valores);
        listaAdicionados.add(valores);
        return listaAdicionados;
    }
}
