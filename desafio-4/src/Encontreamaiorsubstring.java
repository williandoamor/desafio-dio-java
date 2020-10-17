
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Encontreamaiorsubstring {

    public static void main(String[] args) throws IOException {

        String linha1 = new String();
        String linha2 = new String();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String ocorrencia = "";
            linha1 = scanner.nextLine();
            if (scanner.hasNextLine()) {

                linha2 = scanner.nextLine();
            }

            if (linha2.length() >= linha1.length()) {


                String linha3 = linha1 + linha2;
                int n = linha3.length();
                for (int i = 0; i < n; i++) {

                    for (int j = i + 1; j < n; j++) {

                        String x = CheckSizeSequence.checkSequence(linha3.substring(i, n), linha3.substring(j, n));

                        if (x.length() > ocorrencia.length()) {

                            ocorrencia = x;
                        }
                    }
                }

                System.out.println(ocorrencia.length());


            }else {

                System.out.println(ocorrencia.length());
            }


        }

        scanner.close();

    }

}

class CheckSizeSequence {


    public static String checkSequence(String a, String b) {

        int n = Math.min(a.length(), b.length());
        try {

            for (int i = 0; i < n; i++) {

                if (a.charAt(i) != b.charAt(i)) {

                    return a.substring(0, i);
                }
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return a.substring(0, n);
    }

}