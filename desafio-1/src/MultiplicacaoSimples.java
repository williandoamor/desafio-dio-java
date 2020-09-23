import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicacaoSimples {


    public static void main(String[] args) throws IOException, IOException {

        String a, b;
        //
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        a = bufferedReader.readLine();
        //
        b = bufferedReader.readLine();

        int PROD = Integer.parseInt(a) * Integer.parseInt(b);

        System.out.println("PROD = " + PROD);

    }

}
