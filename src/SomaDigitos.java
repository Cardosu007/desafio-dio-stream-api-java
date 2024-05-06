import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SomaDigitos {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public int getSomaDigitos() {
        return numeros.stream()
                .flatMapToInt(numero -> String.valueOf(numero).chars().map(Character::getNumericValue)).sum();
    }
}
