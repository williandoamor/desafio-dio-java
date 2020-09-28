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
        //
        while ((linha = reader.readLine()) != null) {

            String[] compras = linha.split(" ");
            hashSet = new HashSet<>();
            for (int i = 0; i < compras.length; i++) {

                hashSet.add(compras[i]);
            }
            List<String> lista = hashSet.stream().collect(Collectors.toList());
            Collections.sort(lista);
            for (int x = 0; x < lista.size(); x++) {

                System.out.print("" + lista.get(x) + " ");
            }
            System.out.print("\n");
        }

    }

}
