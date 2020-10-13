import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ordenacaodepalavrasportamanho {

    public static void main(String[] args) throws IOException {

        String linha;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*Primeira linha pega o numero de entrada que ser informado para o teste*/
        int testeNumber = Integer.parseInt(br.readLine());
        /*Enquanto a linha nao for nulla e o numero de caso de
        * teste nao for maior que zero le a linha*/
        while (testeNumber > 0 && (linha = br.readLine()) != null) {

            /*Le a linha e tranforma em um array
            quebrando onde tiver espaco*/
            String[] entrada = linha.split(" ");
            /*Ordena o array*/
            Arrays.sort(entrada, new Ordenar());
            /*Imprimi na tela o array ordenadao*/
            for (String s : entrada) {

                System.out.print(s + " ");

            }

            /*Salta uma linha em branco*/
            System.out.println();
            /*Subtrai um do numero de testes
            * para que nao gere loop infinito
            * */
            testeNumber--;
        }


    }
}

/*A classe Ordenar implementa a interface comparator*/
class Ordenar implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {

        if (t1.length() > s.length()) {

            return 1;

        } else if (t1.length() < s.length()) {

            return -1;

        } else if (t1.length() == s.length()) {

            return s.compareToIgnoreCase(t1);
        }

        return 0;
    }
}


