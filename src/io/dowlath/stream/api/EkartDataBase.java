package io.dowlath.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"Dowlath","dowlath@email.com", Arrays.asList("123","321")),
                new Customer(102,"Basha","basha@email.com", Arrays.asList("111","222")),
                new Customer(103,"Arsh","arsh@email.com", Arrays.asList("333","444")),
                new Customer(101,"Ariz","ariz@email.com", Arrays.asList("666","555"))

        ).collect(Collectors.toList());
    }
}
