package io.dowlath.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String tax){
        /*

        if(tax.equalsIgnoreCase("tax")) {
            return DataBase.getEmployees().stream().filter(t -> t.getSalary() > 500000).collect(Collectors.toList());
        } else {
            return DataBase.getEmployees().stream().filter(t -> t.getSalary() <= 500000).collect(Collectors.toList());
        }
         */

        // Instead of this ,using ternary operator
        return (tax.equalsIgnoreCase("tax")) ? DataBase.getEmployees().stream().filter(t -> t.getSalary() > 500000).collect(Collectors.toList()) :
                DataBase.getEmployees().stream().filter(t -> t.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {

       // System.out.println(TaxService.evaluateTaxUsers()); // o/p : [Employee{id=100, name='Dowlath', dept='IT', salary=600000}, Employee{id=103, name='Basha', dept='Director', salary=700000}]
       // System.out.println(TaxService.evaluateTaxUsers("tax"));
        System.out.println(TaxService.evaluateTaxUsers("non tax"));

    }
}
