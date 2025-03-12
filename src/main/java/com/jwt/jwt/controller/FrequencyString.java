package com.jwt.jwt.controller;

import org.antlr.v4.runtime.IntStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyString {

    public static void main(String args[]){
        String inputString = "Java Concept Of The Day";
        inputString.chars().mapToObj(c -> (char) c ).filter(i->i!=' ').collect(Collectors.groupingBy( Function.identity(),Collectors.counting())).forEach((k,v) -> System.out.println(k + " = " + v));

        //How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

        List<String> listOfStrings = Arrays.asList("w","Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn","abc");
       String a= listOfStrings.stream().collect(Collectors.joining(",","[", "]" ));
       System.out.println(a);

       int num=233323;
        Stream.of(Arrays.stream(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt))).forEach(System.out::println);


        listOfStrings.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);


    }
}
