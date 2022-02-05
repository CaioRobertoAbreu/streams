package streams.test;

import streams.template.ListAninhadaTemplate;
import streams.template.ListPalavrasTemplate;

import java.util.Arrays;

/*
1. Pegar todas as palavras e retornar um array com todas as letras
*/
public class FlatMapMaisComplexo {
    public static void main(String[] args) {

        var nomes = ListPalavrasTemplate.get();
        var palavras = ListAninhadaTemplate.get();

        nomes.stream()
                .map(n -> n.split(""))
                .flatMap(l -> Arrays.stream(l))
                .forEach(System.out::print);

        System.out.println();

       palavras.stream()
                .flatMap(p -> p.stream())
                .map(p -> p.split(""))
                .flatMap(l -> Arrays.stream(l))
                .forEach(System.out::println);

    }



}
