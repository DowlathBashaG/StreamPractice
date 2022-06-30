package io.dowlath.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* predicate functional interface using test method with one arugment */

public class PredicateDemo {
    public static void main(String[] args) {
      /*  Predicate<Integer> predicate = t -> t % 2 == 0 ;
        System.out.println(predicate.test(3)); */

        List<Integer> list = Arrays.asList(1,2,3,4);
      //  list.stream().filter(predicate).forEach(t-> System.out.println("Printing Even...:" + t));
        // Instead of passing reference pass condition
        list.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.println("Printing Even...:" + t));

    }
}
