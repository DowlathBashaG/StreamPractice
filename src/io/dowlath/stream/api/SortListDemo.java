package io.dowlath.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(10);

        /*

        //Traditional approach
        Collections.sort(list); // Ascending order
        System.out.println("Ascending Order ... :" +list);

        Collections.reverseOrder(); // Decending order
        System.out.println("Decesending order ... : "+ list);

        */

        /* This is for primitive type...
        list.stream().sorted().forEach(s -> System.out.println("Ascending Order ...: "+ s)); // ascending order

        System.out.println(" ");

        list.stream().sorted(Comparator.reverseOrder()).forEach(y-> System.out.println("Decending Order .. :"+y) );
        */

        /*
        Traditional approach for Objects...*/

        List<Employee> employees = DataBase.getEmployees();
       // Collections.sort(employees,new MyEmployeeSalaryComparator());

        /*
        Collections.sort(employees,new Comparator<Employee>(){
            public int compare(Employee e1,Employee e2){
                return (int)(e1.getSalary() - e2.getSalary());
            }
                });

         */


        //Instead of the above one we can directly use lamda functions.
        //Collections.sort(employees,(o1,o2) -> (int) (o1.getSalary() - o2.getSalary()));

        //Now we can use comparator...using stream.
        employees.stream().sorted((o1,o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);

        System.out.println(" ");

        //Now directly using stream and those methods.
        employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);

        System.out.println(" ");

        //use the method reference we can solve this.
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        System.out.println("  ");
        //Based on Name you can sort
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        // System.out.println(employees); // Ascending order
       // System.out.println(employees); // Decending order


    }

}

/*
class MyEmployeeSalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
       // return (int)(o1.getSalary() - o2.getSalary()); // printing in ascending order
        return (int)(o2.getSalary() - o1.getSalary()); // printing in desending order
    }
}
*/