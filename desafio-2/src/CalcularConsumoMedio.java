import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class CalcularConsumoMedio {


    public static void main(String[] args) throws IOException {

        BigDecimal km;
        BigDecimal combustivel;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        km = new BigDecimal(br.readLine());
        //
        combustivel =new BigDecimal(br.readLine());
        //
        BigDecimal comMedio = km.divide(combustivel, MathContext.DECIMAL32).setScale(3, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("" + comMedio + " km/l");


    }
}
