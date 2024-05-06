import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaiorValor {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public Optional<Integer> getSegundoMaiorValor() {
        return numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }
}
