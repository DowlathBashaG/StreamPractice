package io.dowlath.stream.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDataBase {
    public static List<Emp> getEmployees(){
       return Stream.of(new Emp(101,"Dowlath","A",6000),
               new Emp(102,"Basha","B",7000),
               new Emp(103,"Arsh","A",9000),
               new Emp(104,"Ariz","C",3000),
               new Emp(105,"Naveeda","B",8000)
               ).collect(Collectors.toList());

    }
}
