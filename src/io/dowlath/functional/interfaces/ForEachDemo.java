package io.dowlath.functional.interfaces;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Dowlath");
        list.add("Basha");
        list.add("Arsh");
        list.add("Ariz");
        list.add("Naveeda");

        //list.stream().forEach(s -> System.out.println(s));
        list.stream().filter(t->t.startsWith("A")).forEach(s -> System.out.println(s));

        Map<Integer,String> hMap = new HashMap<>();
        hMap.put(1,"A");
        hMap.put(2,"B");
        hMap.put(3,"C");
        hMap.put(4,"D");
        hMap.put(5,"E");

        // hMap.forEach((key,value) -> System.out.println(key+" : "+ value)); // if you use this you cant use stream pipelines
       // hMap.entrySet().forEach(obj -> System.out.println(obj));
        // Now filter with Map based on key 2 & 4 .

        hMap.entrySet().stream().filter( k -> k.getKey() % 2 == 0).forEach(s -> System.out.println(s));



    }
}
