import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumerosPares {


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumerosPares() {
        return Collections.singletonList(numeros.stream().filter(numero -> numero % 2 == 0).mapToInt(Integer::intValue).sum());

    }
}
