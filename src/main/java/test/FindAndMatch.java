package test;

import dominio.LightNovel;
import template.LightNovelsTemplate;

import java.util.Optional;

/*
1. Encontrar elementos
*/
public class FindAndMatch {

    public static void main(String[] args) {

        var lightNovels = LightNovelsTemplate.getList();

        var algumMaiorQue8 = lightNovels.stream()
                .anyMatch(ln -> ln.getPrice() > 8); //retorna um boolean

        System.out.println(algumMaiorQue8);

        boolean todosMaioresQue299 = lightNovels.stream()
                .allMatch(ln -> ln.getPrice() > 2.99);

        System.out.println(todosMaioresQue299);

        boolean nenhumMaiorQue200 = lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() > 200);
        System.out.println(nenhumMaiorQue200);

        lightNovels.stream()
                .filter(ln -> ln.getTitle().startsWith("T") && ln.getPrice() > 2.00)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3.0)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3.0)
                .findFirst()
                .ifPresent(System.out::println);


    }
}
