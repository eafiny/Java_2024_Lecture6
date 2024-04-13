package ru.muctr.StreamAPI_Demo;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Evgenia Skichko
 */
public class DifferentStreams {
    public static void main(String[] args) {

        List<Integer> intList = List.of(1, 2, 2, 3, 4, 55, 5);

        intList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
//        intList.stream()
//                .forEach( System.out::println);

//        intList.stream()
//                .filter(x -> x > 2)
//                .map(x -> x * 10)
//                .forEach(System.out ::println);

//        Set<Integer> list2 = intList.stream()
//                .filter(x -> x < 3)
//                .collect(Collectors.toSet(TreeSet::new));
//        System.out.println(list2);


        //Стрим из списка
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list.stream()
//                .filter(x -> x < 5)
//                .map(x -> x * 10)
//                .forEach(System.out::println);
//
//        //Стрим из массива
        Integer[] intArray = new Integer[]{4, 6, 2, 7, 6};
        List<Integer> listFromArray = Arrays.stream(intArray)
                                            .collect(Collectors.toList());
//
//        //Стрим из множества
        Set<String> set = new HashSet<>(List.of("Java", "Python", "C++"));
        set.stream()
                .filter(x -> x.length() > 3)
                .forEach(System.out::println);
//
//        //Стрим из Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Php");
        map.values().stream()
                .forEach(System.out::println);

//
//        //Optional<T>
            Double num = null;
            Optional<Double> opt = Optional.ofNullable(num);
            System.out.println(opt.orElse(0.0));
            System.out.println(opt.orElseGet(Math::random));
//        System.out.println(opt.orElseThrow());
//        System.out.println(opt.orElseThrow(() -> new RuntimeException()));

//        //Редукция
        List<Integer> reduceList = List.of(1, 2, 3, 4, 5);
//        Optional<Integer> sum = reduceList.stream()
//                                            .reduce((acc, el) -> acc + el);
//
//        int sum1000 = reduceList.stream()
//                .reduce(1000, (acc, el) -> acc + el);
//        System.out.println("Сумма = " + sum1000);
//
//        //Числовой стрим
        int sumInt = reduceList.stream()
                                .mapToInt( x -> x)
                                .sum();
        System.out.println("Сумма числового стрима = " + sumInt);

        OptionalInt maxInt = reduceList.stream()
                                        .mapToInt(x -> x)
                                        .max();
        System.out.println("Максимум числового стрима = " + maxInt);

        Optional<Integer> maxInt2 = List.of(1, 5, 2, 4, 3).stream()
                                        .max(Integer::compareTo);

        List<String> numberList = List.of("1", "2", "3");
        OptionalDouble averageStringList = numberList.stream()
                .mapToDouble(Integer::parseInt)
                .average();
        System.out.println("Среднее значение = " + averageStringList.orElseGet(() -> 0.0));

    }
}
