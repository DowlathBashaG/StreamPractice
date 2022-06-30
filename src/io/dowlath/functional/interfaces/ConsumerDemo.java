package io.dowlath.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* Consumer functional interface have accept method with paramenter , this method does not return any return value. */

public class ConsumerDemo {
    public static void main(String[] args) {
      /*  Consumer<Integer> consumer = t -> System.out.println("Print ... : " +t);
        consumer.accept(10); */

        /* ForEach method always accept the consumer accept method */

        List<Integer> list = Arrays.asList(1,2,3,4);
      //  list.stream().forEach(consumer);
        list.stream().forEach(t -> System.out.println("Print ... : " +t));
        /*
        Print ... : 1
        Print ... : 2
        Print ... : 3
        Print ... : 4
         */

    }
}
