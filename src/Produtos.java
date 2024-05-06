import java.util.Arrays;
import java.util.List;

public class Produtos {


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    public int getProdutos() {
        return numeros.stream().reduce(1, (a, b) -> a * b);
    }
}
