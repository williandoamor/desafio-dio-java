import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ordenacao {


    public static void main(String[] args) throws IOException {

        String linha;
        Integer namber;
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        /*Pula a primeira linha*/
        buffer.readLine();

        while ((linha = buffer.readLine()) != null) {

            namber = Integer.parseInt(linha);

            if (namber % 2 == 0) {

                par.add(namber);

            } else {

                impar.add(namber);
            }

        }

        /*Ordena a lista em ordem crescente*/
        Collections.sort(par);
        /*Ordena a lista a lista em orde decrescente*/
        Collections.sort(impar, Collections.reverseOrder());
        //
        for (int x = 0; x < par.size(); x++) {

            System.out.println(par.get(x));
        }
       //
       for (int i = 0; i < impar.size(); i++) {

           System.out.println(impar.get(i));
       }

    }

}
