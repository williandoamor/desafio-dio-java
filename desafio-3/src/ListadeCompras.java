import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListadeCompras {


    public static void main(String[] args) throws IOException {

        String linha;
        String[] compras = new String[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*Pula a primeira linha*/
        reader.readLine();
        //
        while ((linha = reader.readLine()) != null) {

            compras = linha.split(" ");

        }
        //
        for (int i = 0; i < compras.length; i++) {

            System.out.println(compras[i]);

        }

    }


}
