public class Main {
    public static void main(String[] args) {

        OrdemNumerica ordemNumerica = new OrdemNumerica();
        NumerosPares numerosPares = new NumerosPares();
        NumerosPositivos numerosPositivos = new NumerosPositivos();

        System.out.println(ordemNumerica.getNumerosOrdenados());

        System.out.println(numerosPares.getNumerosPares());

        System.out.println(numerosPositivos.getNumerosPositivos());

    }
}