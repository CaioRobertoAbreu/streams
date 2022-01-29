package test;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {

        var integers = List.of(1, 2, 3, 4, 5, 6);

        integers.stream()
                .reduce((c, y) -> c + y)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        integers.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);

        var soma = integers.stream()
                .reduce(0, (x, y) -> x + y);

        var soma2 = integers.stream()
                .reduce(0, Integer::sum);

        System.out.println(soma);
        System.out.println(soma2);
    }
}
