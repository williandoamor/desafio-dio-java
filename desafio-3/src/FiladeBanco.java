import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class FiladeBanco {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int casosTeste = Integer.parseInt(br.readLine());

            List<Integer> fila = new ArrayList<>();
            List<Integer> filaOrder = new ArrayList<>();

            StringTokenizer st;

            for (int i = 0; i < casosTeste; i++) {

                int numClientes = Integer.parseInt(br.readLine());

                st = new StringTokenizer(br.readLine());

                while (st.hasMoreTokens()) {
                    fila.add(Integer.parseInt(st.nextToken()));
                }

                filaOrder.addAll(fila);
                Collections.sort(filaOrder, Collections.reverseOrder());

                int quantCli = fila.size();
                int cont = 0;

                for (int j = 0; j < quantCli; j++) {

                    if (fila.get(j).equals(filaOrder.get(j))) {
                        cont++;
                        // System.out.println(fila.get(j) + " = " + filaOrder.get(j));
                    }
                }

                System.out.println(cont);
                fila.clear();
                filaOrder.clear();

            }

        }
    }
}