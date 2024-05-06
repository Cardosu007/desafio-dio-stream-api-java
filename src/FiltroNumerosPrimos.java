import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroNumerosPrimos {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);


    public void filtrarNumerosPrimos() {
        List<Integer> primos = numeros.stream().filter(this::isPrimo).collect(Collectors.toList());

        System.out.println("Números primos: " + primos);
    }

    private boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
