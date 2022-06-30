package io.dowlath.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> listOfCustomer = EkartDataBase.getAll();

        // Map
        /*
            List<Customer> convert List<String>  : This is Data Transformation
            mapping : customer -> customer.getEmail() -> one to one mapping
         */
        List<String> emails = listOfCustomer.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        // FlatMap
        /*
          List<Customer> convert List<String>  : This is Data Transformation
          mapping : customer -> phone numbers
          customer -> getPhoneNumber -> one to many mapping

         */

        List<String> phoneNumbers = listOfCustomer.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
