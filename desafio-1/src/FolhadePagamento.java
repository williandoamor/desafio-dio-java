import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FolhadePagamento {

    public static void main(String[] args) throws IOException {

        String a, b, c;
        //
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        a = bufferedReader.readLine();
        //
        b = bufferedReader.readLine();
        //
        c = bufferedReader.readLine();

        int NUMBER = Integer.parseInt(a);
        float valor = Integer.parseInt(b) * Float.parseFloat(c);


        String SALARY = String.format("%.2f", valor);

        System.out.println("NUMBER = " + NUMBER);
        System.out.println("SALARY = U$ " + SALARY);
        System.out.println("" + SALARY);

    }
}
