package io.dowlath.stream.api;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Eight", 8);
        map.put("Four",4);
        map.put("Six",6);
        map.put("Three",3);

        // Before sorting we need to convert as List.
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
      /*  Collections.sort(entries,new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        }); */

        /*
        Collections.sort(entries,(o1,o2) -> o1.getKey().compareTo(o2.getKey()));
        // Ascending order
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey() +  ":" +entry.getValue());
        }
        */
        // Now directly print using stream api
        // Based on Key sorting
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("");
        // Based on Value sorting
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println();
        // Custom class

        Map<Employee,Integer> employeeMap = new TreeMap<>((o1,o2) -> (int) (o1.getSalary() - o2.getSalary()));
        employeeMap.put(new Employee(100,"Dowlath","IT",600000),60);
        employeeMap.put(new Employee(100,"Basha","DEV",700000),90);
        employeeMap.put(new Employee(100,"Ariz","Finance",900000),120);
        employeeMap.put(new Employee(100,"Arsh","Prodcution",500000),80);
        employeeMap.put(new Employee(100,"Naveeda","SOCIAL",800000),30);


        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println); // Ascending order

        System.out.println();

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println); // decending order
    }
}
