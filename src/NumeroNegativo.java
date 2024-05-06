import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumeroNegativo {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -3);

    public List<Integer> getNumerosNegativos() {
        return numeros.stream().filter(numero -> numero < 0).collect(Collectors.toList());
    }
}
