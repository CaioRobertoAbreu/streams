package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>(List.of("Amora", "Maca", "Ameixa", "Abacaxi", "Laranja"));

        var retorno = filter(lista, e -> e.toString().startsWith("M"));

        for (Object e : retorno) {
            System.out.println(e);
        }

    }


    private static <T> List<Object> filter(List<T> list, Predicate<T> predicate){

        var listaFiltrada = new ArrayList<>();

        list.forEach(e -> {
            if(predicate.test(e)){
                listaFiltrada.add(e);
            };
        });

        return listaFiltrada;
    }
}
