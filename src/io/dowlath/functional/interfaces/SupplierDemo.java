package io.dowlath.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "This is Dowlath Basha G";
        System.out.println(supplier.get()); // This is Dowlath Basha G

        List<String> list = Arrays.asList("a","b");
        System.out.println(list.stream().findAny().orElseGet(supplier)); /*This is Dowlath Basha G
                                                                         a  */

        // if list does not contain any...
        List<String> list1 = Arrays.asList(); // List is Empty;
        System.out.println(list1.stream().findAny().orElseGet(() -> "This is Dowlath Basha G"));



    }
}
