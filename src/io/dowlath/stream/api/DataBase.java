package io.dowlath.stream.api;

import java.util.ArrayList;
import java.util.List;
// DAO - Database access layer
public class DataBase {
    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100,"Dowlath","IT",600000));
        list.add(new Employee(101,"Arsh","HR",200000));
        list.add(new Employee(102,"Ariz","Dev",500000));
        list.add(new Employee(103,"Basha","Director",700000));
        list.add(new Employee(104,"Naveeda","Manager",300000));
        return list;
    }
}
