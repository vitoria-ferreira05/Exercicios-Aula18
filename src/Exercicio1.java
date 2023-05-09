import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Escreva um programa para remover um elemento específico de uma
        //lista.

        Scanner sc = new Scanner(System.in);

        List<String> listaCidades = new ArrayList<>();

        listaCidades.add("Uberlândia");
        listaCidades.add("Iturama");
        listaCidades.add("Rio de Janeiro");
        listaCidades.add("Porto Alegre");
        listaCidades.add("Monte Alegre");

        String cidade = "Iturama";

        System.out.println("Lista cidade: " + listaCidades);

        if (listaCidades.contains(cidade)) {
            listaCidades.remove(cidade);
            System.out.println("A cidade " + cidade + " foi retirada da lista");
        }
        System.out.println("Lista cidade atualizada: " + listaCidades);
    }
}
