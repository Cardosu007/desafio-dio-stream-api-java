import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MediaNumerosMaioresQueCinco {


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public OptionalDouble getMediaNumeros() {
        return numeros.stream().filter(numero -> numero >= 5).mapToDouble(Integer::intValue).average();
    }
}
