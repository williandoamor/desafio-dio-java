import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class ListadeCompras {


    public static void main(String[] args) throws IOException {

        HashSet<String> hashSet;
        String linha;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*Pula a primeira linha*/
        reader.readLine();
        /*Faz um while para criar o loop
        * que varre o BufferedReader*/
        while ((linha = reader.readLine()) != null) {
            /*Para cada repeticao cria um novo array*/
            String[] compras = linha.split(" ");
            /*Para cada repeticao cria um novo HashSet
            * e adiciona cada posicao do array*/
            hashSet = new HashSet<>();
            for (int i = 0; i < compras.length; i++) {

                hashSet.add(compras[i]);
            }
            /*Converte o HashSet em Lista*/
            List<String> lista = hashSet.stream().collect(Collectors.toList());
            /*Ordena a lista em ordem crescente*/
            Collections.sort(lista);
            /*Exite o valor na tela de acordo com cada posicao da lista*/
            for (int x = 0; x < lista.size(); x++) {

                System.out.print("" + lista.get(x) + " ");
            }
            /*Pula linha*/
            System.out.print("\n");
        }

    }

}
