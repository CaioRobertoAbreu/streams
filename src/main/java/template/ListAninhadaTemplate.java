package template;

import java.util.ArrayList;
import java.util.List;

public class ListAninhadaTemplate {

    public static List<List<String>> get(){

        List<List<String>> list = new ArrayList<>();

        var nomesMulheresList = List.of("Maria", "Joana", "Gabriela", "Carina");
        var nomesHomensList = List.of("Pedro", "Mario", "Lucas", "Paulo");
        var objetos = List.of("Porta", "Cadeira", "Garfo", "Armario");

        list.add(nomesHomensList);
        list.add(nomesMulheresList);
        list.add(objetos);

        return list;
    }
}
