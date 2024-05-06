import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParImpar {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public List<List<Integer>> getParImpar() {
        List<Integer> pares = numeros.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());
        List<Integer> impares = numeros.stream().filter(numero -> numero % 2 != 0).collect(Collectors.toList());
        return Arrays.asList(pares, impares);
    }
}
