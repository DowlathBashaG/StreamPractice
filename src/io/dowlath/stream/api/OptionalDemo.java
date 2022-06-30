package io.dowlath.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String email){
        List<Customer> customers = EkartDataBase.getAll();
        return customers.stream()
                 .filter(emailid -> emailid.getEmail().equals(email))
                .findAny().get();


    }
    public static void main(String[] args) {

        Customer customerEmailNull = new Customer(101,"john",null, Arrays.asList("123","321"));
        Customer customer = new Customer(101,"john","test@email.com", Arrays.asList("123","321"));
        Customer customerEmailNullOfNullable = new Customer(101,"john",null, Arrays.asList("123","321"));
        Customer customerEmailMapUpperCase = new Customer(101,"john","test@email.com", Arrays.asList("123","321"));


        //empty  -> returns Optional.empty
        //of  -> returns nullpointer exception
        //ofNullable  -> returns even its null it wont return nullpointer exception it return Optional.Empty

        //Optional<String> optionalEmpty = Optional.empty();
        //System.out.println(optionalEmpty);


        //<String> emailOptional = Optional.of(customerEmailNull.getEmail());
        //System.out.println(emailOptional); // return NullPointerException becoz of email field is null

        /*Optional<String> optionalOfNullable = Optional.ofNullable(customerEmailNullOfNullable.getEmail());
        if(optionalOfNullable.isPresent()){
            System.out.println(optionalOfNullable.get()); // empty , it wont give null pointer exception even if you pass null.
        }*/
        //System.out.println(optionalOfNullable);  // Even it is null its returning Optional.empty.

       // System.out.println(optionalOfNullable.orElse("default@email.com")); // prints : default@email.com

        //System.out.println(optionalOfNullable.orElseThrow(() -> new IllegalArgumentException("email not present")));

        /*

        prints :

        Exception in thread "main" java.lang.IllegalArgumentException: email not present
        at io.dowlath.stream.api.OptionalDemo.lambda$main$1(OptionalDemo.java:43)
        at java.base/java.util.Optional.orElseThrow(Optional.java:408)
        at io.dowlath.stream.api.OptionalDemo.main(OptionalDemo.java:43)

        */
        //Optional<String> customerEmailMapUpperCaseOfNullable = Optional.ofNullable(customer.getEmail());
        //System.out.println(customerEmailMapUpperCaseOfNullable.map(String::toUpperCase).orElseGet(()->"default email ")); // prints : TEST@EMAIL.COM

        getCustomerByEmailId("pqr") ; // prints NoSuchElementException





    }
}
