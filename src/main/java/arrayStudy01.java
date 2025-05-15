package kopo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayStudy01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        int listSize = list.size();

        System.out.println(listSize);

        for(int i = 0; i < listSize; i ++) {
            System.out.println("name : " + list.get(i));//1세대
        }

        for(String name : list ) {
            System.out.println("name : " + name);
        } // Second Generation

        list.forEach(name -> System.out.println("name : " + name));

        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String name = it.next();
            System.out.println("name : " + name);
        }
    }
}

