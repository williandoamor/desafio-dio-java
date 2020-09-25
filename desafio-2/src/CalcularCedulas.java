import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcularCedulas {

    public static void main(String[] args) throws IOException {

        String valorpagar;
        int apagar;
        int[] notas = new int[]{100, 50, 20, 10, 5, 2, 1};
        int[] totalNotas = new int[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        valorpagar = br.readLine();
        if (valorpagar != null && !"".equalsIgnoreCase(valorpagar) && !"0".equalsIgnoreCase(valorpagar)) {

            apagar = Integer.parseInt(valorpagar);
            for (int i = 0; i < 7; i++) {

                if (apagar >= notas[i]) {

                    totalNotas[i] = apagar / notas[i];
                    apagar = apagar - totalNotas[i] * notas[i];

                }
            }
            //
            System.out.println("" + Integer.parseInt(valorpagar));
            for (int i = 0; i < 7; i++) {

                System.out.println(totalNotas[i] + " nota(s) de R$ " + notas[i] +",00");

            }

        }

    }
}
