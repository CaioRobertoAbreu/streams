package test;

import dominio.LightNovel;
import template.LightNovelsTemplate;

import java.util.Comparator;
import java.util.stream.Collectors;

/*
1. Ordernar por titulo
2. Trazer 3 primeiros light novels com valor menor que 4
*/
public class Ordernacao {

    public static void main(String[] args) {

        var listLightNovels = LightNovelsTemplate.getList();

        var titles = listLightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4.00)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        titles.forEach(System.out::println);
    }
}
