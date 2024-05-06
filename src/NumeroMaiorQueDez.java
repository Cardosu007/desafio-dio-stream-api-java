import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumeroMaiorQueDez {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12);

    public List<Integer> getNumerosMaiorQueDez() {
        return numeros.stream().filter(numero -> numero > 10).collect(Collectors.toList());
    }
}
