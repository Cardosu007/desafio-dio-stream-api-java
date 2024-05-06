import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumerosDistintos {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

    public void getNumerosDistintos() {
        int numerosTotais = (int) numeros.stream().distinct().count();
        boolean saoDistintos = numerosTotais == numeros.size();
        if(saoDistintos) {
            System.out.println("Todos os números são distintos");
        } else{
            System.out.println("Tem números que se repetem na lista");
        }
    }
}
