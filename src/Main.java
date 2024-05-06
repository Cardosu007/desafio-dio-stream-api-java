public class Main {
    public static void main(String[] args) {

        OrdemNumerica ordemNumerica = new OrdemNumerica();
        NumerosPares numerosPares = new NumerosPares();
        NumerosPositivos numerosPositivos = new NumerosPositivos();
        RemoveNumerosImpares removeNumerosImpares = new RemoveNumerosImpares();
        MediaNumerosMaioresQueCinco mediaNumerosMaioresQueCinco = new MediaNumerosMaioresQueCinco();

        // System.out.println(ordemNumerica.getNumerosOrdenados());

        //  System.out.println(numerosPares.getNumerosPares());

        //  System.out.println(numerosPositivos.getNumerosPositivos());

        // System.out.println(removeNumerosImpares.getNumerosImpar());

        System.out.println(mediaNumerosMaioresQueCinco.getMediaNumeros());

    }
}