import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AgrupeValores {


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);


    public List<Integer> getAgruparValores() {
        return (List<Integer>) numeros.stream().filter(numero -> numero % 2 != 0).filter(numero -> numero % 3 == 0 || numero % 5 == 0).collect(Collectors.toList());
    }
}
