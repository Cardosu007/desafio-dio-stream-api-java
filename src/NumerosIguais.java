import java.util.Arrays;
import java.util.List;

public class NumerosIguais {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    public void verificarNumerosIguais() {
        boolean todosIguais = numeros.stream().allMatch(numero -> numero.equals(numeros.get(0)));

        if (todosIguais) {
            System.out.println("Todos os números são iguais.");
        } else {
            System.out.println("Os números não são todos iguais.");
        }
    }
}
