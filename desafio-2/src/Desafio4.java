import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Desafio4 {

    public static void main(String[] args) throws IOException {

       String linha;
       Double n;
       int Pos, i;
       Pos=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       for (i=0; i < 6; i++) {

           linha = br.readLine();
           n = Double.parseDouble(linha);
           if(n > 0.0)Pos++;
       }

       System.out.println("" + Pos + " valores positivos");

    }
}
