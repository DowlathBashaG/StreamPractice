package io.dowlath.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,6,9);
        List<String> wordsList = Arrays.asList("Core Java","AWS","RESTful","Google");

        Integer reduceInteger = integerList.stream().reduce(0,(a,b) -> a+b);
        System.out.println(reduceInteger);

        //using optional and method reference
        Optional<Integer> reduceResultUsingMethodReferenceAndOptional = integerList.stream().reduce(Integer::sum);
        System.out.println(reduceResultUsingMethodReferenceAndOptional.get());

        //find max values
        Integer reduceMax = integerList.stream().reduce(0,(a,b) -> a>b ? a:b);
        System.out.println("Maximum .... : "+reduceMax);

        // using method reference max
        Integer maxValue = integerList.stream().reduce(Integer::max).get();
        System.out.println("Max value using method reference.... : "+maxValue);

        // using method reference min
        Integer minValue = integerList.stream().reduce(Integer::min).get();
        System.out.println("Min value using method reference.... : "+minValue);

        // find max length in the given list of strings
        String longestString = wordsList.stream().reduce((words1,words2) -> words1.length()  > words2.length() ? words1 : words2).get();
        System.out.println("Given string max length ... : "+ longestString);

        // find whose grade of Employee is "A" and get the average salary using reduce funtion
        Double averageSalary = EmpDataBase.getEmployees().stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();
        System.out.println(averageSalary);

        // find whose grade of Employee is "A" and get the average salary using reduce funtion
        Double gradeIsASumOfSalary = EmpDataBase.getEmployees().stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println(gradeIsASumOfSalary);
    }
}
