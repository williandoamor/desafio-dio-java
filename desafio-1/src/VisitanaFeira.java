import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VisitanaFeira {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = reader.readLine()) != null && line.length() != 0) {
            String[] input = line.split(" ");
            if (input.length == 2) {

                System.out.println("X = " + somar(input[0], input[1]));
            }

        }

    }

    public static int somar(String a, String b) {

        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
