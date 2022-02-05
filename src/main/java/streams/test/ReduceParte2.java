package streams.test;

import streams.template.LightNovelsTemplate;

import java.util.stream.IntStream;

/*
1. Somar o preco de todos os LightNovels
*/
public class ReduceParte2 {
    public static void main(String[] args) {

        var lightNovels = LightNovelsTemplate.getList();

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3.0)
                .map(ln -> ln.getPrice())
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        //Melhor perfomance
        double sum = lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3.0)
                .mapToDouble(ln -> ln.getPrice())
                .sum();

        System.out.println(sum);

        System.out.println( IntStream.of(1, 2, 4, 5).sum());

    }
}
