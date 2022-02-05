package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>(List.of("Amora", "Maca", "Ameixa", "Abacaxi", "Laranja"));

        var retorno = map(lista, e -> e.toUpperCase(Locale.ROOT));

        for (String s : retorno) {
            System.out.println(s);
        }

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){

        List<R> listaMapeada = new ArrayList<>();

        for (T e : list) {
            var retorno = function.apply(e);
            listaMapeada.add(retorno);
        }

        return listaMapeada;
    }
}
