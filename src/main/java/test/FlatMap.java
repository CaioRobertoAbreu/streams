package test;

import template.ListAninhadaTemplate;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
1. Retornar todos os nomes presentes na lista
*/
public class FlatMap {

    public static void main(String[] args) {

        var nomes = ListAninhadaTemplate.get();
        /*Sem STREAM */

        System.out.println("SEM STREAM");
        for (List<String> nome : nomes) {
            for (String n : nome) {
                System.out.println(n);
            }
        }
        System.out.println("------------------------");
        System.out.println("COM STREAM");

       nomes.stream()
            .flatMap(nome -> nome.stream())
            .forEach(System.out::println);

    }
}
