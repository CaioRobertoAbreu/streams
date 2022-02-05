package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class MyConsumer {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>(List.of("Amora", "Maca", "Ameixa", "Abacaxi", "Laranja"));

        forEach(lista, e -> {
            System.out.println(e.toUpperCase(Locale.ROOT));
        });

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){

        for (T e : list) {
            consumer.accept(e);
        }

    }
}
