package test;

import template.ListAninhadaTemplate;
import template.ListPalavrasTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
