import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Escreva um programa para inserir um elemento (posição específica)
        //em uma lista.

        List<String> listaSabores = new ArrayList<>();

        System.out.println("Lista de pedidos atual da sorveteria: ");

        listaSabores.add("1 de Morango");
        listaSabores.add("2 de Chocolate");
        listaSabores.add("1 de Flocos");

        System.out.println(listaSabores + "\n");

        String novoPedido = "1 de Chocolate branco";

        listaSabores.add(3, novoPedido);

        System.out.println("Lista de pedidos da sorveteria atualizada: \n" + listaSabores);

    }
}
